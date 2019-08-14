package com.management.backend.api.service;

import com.amazonaws.mws.IvenDemoSample;
import com.management.backend.api.controller.ProductUpload;
import com.management.backend.api.controller.entity.AmazonProductUploadEntity;
import com.management.backend.api.mybatis.mapper.AmazonAccountInfoMapper;
import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import com.management.backend.api.mybatis.model.ProductItem;
import com.management.backend.api.mybatis.model.ProductWithBLOBs;
import com.management.backend.api.util.Signature;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.management.relation.Relation;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName UploadToAmazon
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 12:03
 * @Version 1.0
 **/
@Service
public class UploadToAmazon {
    protected static final Logger log = LoggerFactory.getLogger(UploadToAmazon.class);
    private SimpleDateFormat df_date_before = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
    private SimpleDateFormat df_date_after = new SimpleDateFormat("HH:mm:ss");//设置日期格式
    private SimpleDateFormat timeStamp = new SimpleDateFormat("HH:mm:ss.SSS");
    private String dateSimple="";
    private String dateTimeStamp="";
    private String imageLocationPref="http://wechatcool.xyz/ecommerce_backend/images/";

    private String signature="";
    private String url="";
    HashMap<String, String> parameters = new HashMap<String,String>();

  /* 亚马逊的操作：
   * _POST_PRODUCT_DATA_    商品上传数据
   * _POST_PRODUCT_RELATIONSHIP_DATA_   商品关系上传数据
   * _POST_ITEM_DATA_       商品上传数据
   * _POST_PRODUCT_PRICING_DATA_ 仅含价格的上传数据
   * _POST_INVENTORY_AVAILABILITY_DATA_  WebStore 商品上传数据
   * */

    @Autowired
    private AmazonAccountInfoMapper amazonAccountInfoMapper;
    public String common(AmazonAccountInfo amazonAccountInfo,String feedType) throws Exception{
        float timeZoneOffset=0.00f;
        /*if (timeZoneOffset > 13 || timeZoneOffset < -12) {
             timeZoneOffset = 0;
         }*/

         int newTime=(int)(timeZoneOffset * 60 * 60 * 1000);
         TimeZone timeZone;
         String[] ids = TimeZone.getAvailableIDs(newTime);
         if (ids.length == 0) {
             timeZone = TimeZone.getDefault();
         } else {
             timeZone = new SimpleTimeZone(newTime, ids[0]);
         }
        this.df_date_before.setTimeZone(timeZone);
        this.df_date_after.setTimeZone(timeZone);
        this.timeStamp.setTimeZone(timeZone);
        String product_date_before = df_date_before.format(new Date());
        String product_date_after = df_date_after.format(new Date());
        String tmp = timeStamp.format(new Date());

        this.dateSimple=product_date_before+"T"+product_date_after+"Z";
        this.dateTimeStamp=product_date_before+"T"+tmp+"Z";

// Change this secret key to yours
        String secretKey = amazonAccountInfo.getAmazonAccessSecret();
        // Use the endpoint for your marketplace
        String serviceUrl = amazonAccountInfo.getAmazonMwsEndpoint();
//        HashMap<String, String> parameters = new HashMap<String,String>();
        // Add required parameters. Change these as needed.
        this.parameters.put("AWSAccessKeyId", Signature.urlEncode(amazonAccountInfo.getAmazonAccessID()));
        this.parameters.put("Action", Signature.urlEncode("SubmitFeed"));
        this.parameters.put("MWSAuthToken", Signature.urlEncode(amazonAccountInfo.getAmazonAccessSecret()));
        this.parameters.put("SellerId", Signature.urlEncode(amazonAccountInfo.getSellerId()));
        this.parameters.put("SignatureMethod", Signature.urlEncode("HmacSHA256"));
        this.parameters.put("SignatureVersion", Signature.urlEncode("2"));
        this.parameters.put("SubmittedFromDate",
                Signature.urlEncode(this.dateSimple));
        this.parameters.put("Timestamp", Signature.urlEncode(this.dateTimeStamp));
        this.parameters.put("Version", Signature.urlEncode("2009-01-01"));
        this.parameters.put("FeedType", Signature.urlEncode(feedType));

        String formattedParameters = Signature.calculateStringToSignV2(parameters, serviceUrl);
        String signatureTmp = Signature.sign(formattedParameters, secretKey);
        parameters.put("Signature", Signature.urlEncode(signatureTmp));
        String fullUrl = Signature.calculateStringToSignV2(parameters, serviceUrl);
//        log.info(fullUrl);
        this.signature = Signature.urlEncode(signature);
        return fullUrl;

    }

    public void productAllUpload(AmazonAccountInfo amazonAccountInfo, ProductWithBLOBs productWithBLOBs, AmazonProductUploadEntity amazonProductUploadEntity) throws Exception{

        //        组合方法，上传5种方式
        this.productImageUpload(amazonAccountInfo,productWithBLOBs);
        this.productUpload(amazonAccountInfo,productWithBLOBs);
        this.productPriceUpload(amazonAccountInfo,productWithBLOBs);
        this.productRelationshipUpload(amazonAccountInfo,productWithBLOBs);
        this.productInventoryUpload(amazonAccountInfo,productWithBLOBs);

    }

    public String productImageUpload(AmazonAccountInfo amazonAccountInfo,ProductWithBLOBs productWithBLOBs) throws Exception{
        String common = this.common(amazonAccountInfo,"_POST_PRODUCT_IMAGE_DATA_");
        log.info("productImageUpload="+amazonAccountInfo.toString());
//        HttpClient client = HttpClients.createDefault();

        String requestURLParams=amazonAccountInfo.getAmazonMwsEndpoint()+"?"+common;
        System.out.println(requestURLParams);
        String tmp1="    <Message>\n" +
                    "        <MessageID>1</MessageID>\n" +
                    "        <OperationType>Update</OperationType>\n";
        if(productWithBLOBs.getProductItems()==null ||productWithBLOBs.getProductItems().size()==0)
        {
//没有变体
            log.info("productImageUpload:没有变体");
            String[] split = productWithBLOBs.getPictureListString().split(",");
            for (int i = 0; i <split.length ; i++) {
                if (i == 0) {
                    tmp1 += "        <ProductImage>\n" +
                            "            <SKU>" + productWithBLOBs.getParentSkuId() + "</SKU>\n" +
                            "            <ImageType>Main</ImageType>\n" +
                            "            <ImageLocation>" + this.imageLocationPref + split[i] + "</ImageLocation>\n" +
                            "        </ProductImage>\n";
                } else {
                    tmp1 += "        <ProductImage>\n" +
                            "            <SKU>" + productWithBLOBs.getParentSkuId() + "</SKU>\n" +
                            "            <ImageType>Alternate (PT)</ImageType>\n" +
                            "            <ImageLocation>" + this.imageLocationPref + split[i] + "</ImageLocation>\n" +
                            "        </ProductImage>\n";
                }
            }
            tmp1+="        </Message>\n";
        }else
            {
//如果有变体
            log.info("productImageUpload:有变体");
            tmp1 += "<ProductImage>\n" +
                    "     <SKU>" + productWithBLOBs.getParentSkuId() + "</SKU>\n" +
                    "     <ImageType>Main</ImageType>\n" +
                    "     <ImageLocation>" + this.imageLocationPref + productWithBLOBs.getPictureListString().split(",")[0] + "</ImageLocation>\n" +
                    "</ProductImage>\n";

            List<ProductItem> productItems = productWithBLOBs.getProductItems();
            for (int a = 0; a <productItems.size() ; a++) {
                String pictureListString = productItems.get(a).getPictureListString();
                String substringPicture = pictureListString.substring(0, pictureListString.indexOf(","));
                tmp1+="        <ProductImage>\n" +
                        "            <SKU>"+productWithBLOBs.getParentSkuId()+"</SKU>\n" +
                        "            <ImageType>Swatch</ImageType>\n" +
                        "            <ImageLocation>"+this.imageLocationPref+substringPicture+"</ImageLocation>\n" +
                        "        </ProductImage>\n";
            }
            tmp1+="        </Message>\n";
//            父产品图片上传完毕，上传子图片
            for (int b = 0; b <productItems.size() ; b++) {
                tmp1+="    <Message>\n" +
                        "        <MessageID>"+(b+2)+"</MessageID>\n" +
                        "        <OperationType>Update</OperationType>\n";
                String[] split = productItems.get(b).getPictureListString().split(",");
                for (int c = 0; c <split.length ; c++) {
                    if (c == 0) {
                        tmp1 += "        <ProductImage>\n" +
                                "            <SKU>" + productItems.get(b).getSkuId() + "</SKU>\n" +
                                "            <ImageType>Main</ImageType>\n" +
                                "            <ImageLocation>" + this.imageLocationPref + split[c] + "</ImageLocation>\n" +
                                "        </ProductImage>\n";
                    } else {
                        tmp1 += "        <ProductImage>\n" +
                                "            <SKU>" + productItems.get(b).getSkuId() + "</SKU>\n" +
                                "            <ImageType>Alternate (PT)</ImageType>\n" +
                                "            <ImageLocation>" + this.imageLocationPref + split[c] + "</ImageLocation>\n" +
                                "        </ProductImage>\n";
                    }
                }
                tmp1+="        </Message>\n";
            }
        }

        String body="<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<AmazonEnvelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>"+amazonAccountInfo.getMerchantIdentifier()+"</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>ProductImage</MessageType>\n" +
                tmp1+
                "</AmazonEnvelope>";

        log.info("productImageUpload="+body);
        // 要调用的接口方法

        IvenDemoSample.invoke(amazonAccountInfo,"_POST_PRODUCT_IMAGE_DATA_",body);
        String result ="";

/*
        HttpPost post = new HttpPost(requestURLParams);
        try {
            StringEntity s = new StringEntity(body);
//            s.setContentEncoding("UTF-8");
            s.setContentType("text/xml; charset=iso-8859-1");
            post.setEntity(s);

//            post.addHeader("content-type", "application/soap+xml");
            HttpResponse res = client.execute(post);
            HttpEntity entity = res.getEntity();
            System.out.println("productImageUpload respond:"+EntityUtils.toString(entity));
            if (res.getStatusLine().getStatusCode() == HttpStatus.OK.value()) {
                result ="200";
            }else{
                result =res.getStatusLine().getStatusCode()+"";
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        return result;
    }

//    产品上传-未完待续
    public void productUpload(AmazonAccountInfo amazonAccountInfo , ProductWithBLOBs productWithBLOBs) throws Exception{
        String common = this.common(amazonAccountInfo,"_POST_PRODUCT_DATA_");
        HttpClient client = HttpClients.createDefault();

        String requestURLParams=amazonAccountInfo.getAmazonMwsEndpoint()+"?AWSAccessKeyId="+amazonAccountInfo.getAmazonAccessID() +
                "&Action=SubmitFeed" +
                "&FeedType=_POST_PRODUCT_DATA_" +
                "&MWSAuthToken="+amazonAccountInfo.getAmazonAccessSecret() +
                "&MarketplaceIdList.Id.1="+amazonAccountInfo.getMarketplaceId() +
                "&SellerId=" +amazonAccountInfo.getSellerId()+
                "&SignatureMethod=HmacSHA256" +
                "&SignatureVersion=2" +
                "&Timestamp=" +this.dateTimeStamp+
                "&Version=2009-01-01" +
                "&Signature=";

//      根据国家选择产品的语言描述以及类型
        String productTile="";
        String productKeyWords="";
        String productKeyDesc="";
        String productDesc="";
        String amazonProductKeyDesc="";
        String amazonProductKeyWords="";
        String tmp="";

        switch(amazonAccountInfo.getAccountCountry()){
            case "英国" :
                productTile=productWithBLOBs.getEnglishproducttile();
                productKeyWords=productWithBLOBs.getEnglishproductkeywords();
                productKeyDesc=productWithBLOBs.getEnglishproductkeydesc();
                productDesc=productWithBLOBs.getEnglishproductdesc();
                //语句
                break; //可选
            case "法国" :
                productTile=productWithBLOBs.getFrenchproducttile();
                productKeyWords=productWithBLOBs.getFrenchproductkeywords();
                productKeyDesc=productWithBLOBs.getFrenchproductkeydesc();
                productDesc=productWithBLOBs.getFrenchproductdesc();
                break; //可选
            case "德国" :
                productTile=productWithBLOBs.getFrenchproducttile();
                productKeyWords=productWithBLOBs.getFrenchproductkeywords();
                productKeyDesc=productWithBLOBs.getFrenchproductkeydesc();
                productDesc=productWithBLOBs.getFrenchproductdesc();
                break; //可选
            case "意大利" :
                productTile=productWithBLOBs.getItalyproducttile();
                productKeyWords=productWithBLOBs.getItalyproductkeywords();
                productKeyDesc=productWithBLOBs.getItalyproductkeydesc();
                productDesc=productWithBLOBs.getItalyproductdesc();
                break; //可选
            case "西班牙" :
                productTile=productWithBLOBs.getSpanishproducttile();
                productKeyWords=productWithBLOBs.getSpanishproductkeywords();
                productKeyDesc=productWithBLOBs.getSpanishproductkeydesc();
                productDesc=productWithBLOBs.getSpanishproductdesc();
                break; //可选
           /* case "美国" :
                productTile=productWithBLOBs.getEnglishproducttile();
                productKeyWords=productWithBLOBs.getEnglishproductkeywords();
                productKeyDesc=productWithBLOBs.getEnglishproductkeydesc();
                productDesc=productWithBLOBs.getEnglishproductdesc();
                break; //可选
            加拿大，默认使用英文
            case "加拿大" :
                productTile=productWithBLOBs
                productKeyWords=productWithBLOBs
                productKeyDesc=productWithBLOBs
                productDesc=productWithBLOBs
                break; //可选
            case "墨西哥" :
                productTile=productWithBLOBs
                productKeyWords=productWithBLOBs
                productKeyDesc=productWithBLOBs
                productDesc=productWithBLOBs
                break; //可选
            //你可以有任意数量的case语句*/
            default : //可选
                productTile=productWithBLOBs.getEnglishproducttile();
                productKeyWords=productWithBLOBs.getEnglishproductkeywords();
                productKeyDesc=productWithBLOBs.getEnglishproductkeydesc();
                productDesc=productWithBLOBs.getEnglishproductdesc();
        }

        String[] splitProductKeyDesc = productKeyDesc.split("\n");
        for (int i = 0; i <(splitProductKeyDesc.length<5?splitProductKeyDesc.length:5) ; i++) {
            tmp="<BulletPoint>"+splitProductKeyDesc[i]+"</BulletPoint>\n";
            amazonProductKeyDesc+=tmp;
        }
        String[] splitProductKeyWords = productKeyWords.split("\n");
        for (int i = 0; i <(splitProductKeyWords.length<5?splitProductKeyWords.length:5) ; i++) {
            tmp="<SearchTerms>"+splitProductKeyWords[i]+"</SearchTerms>\n";
            amazonProductKeyWords+=tmp;
        }

        String body="<?xml version=\"1.0\" ?>\n" +
                "<AmazonEnvelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>"+amazonAccountInfo.getMerchantIdentifier()+"</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>Product</MessageType>\n" +
                "    <PurgeAndReplace>true</PurgeAndReplace>\n" +
                "    <Message>\n" +
                "        <MessageID>1</MessageID>\n" +
                "        <OperationType>Update</OperationType>\n" +
                "        <Product>\n" +
                "            <SKU>"+ UUID.randomUUID()+"</SKU>\n" +
                "            <ProductTaxCode>A_GEN_TAX</ProductTaxCode>\n" +
                "            <LaunchDate>“”"+this.dateTimeStamp+"</LaunchDate>\n" +
                "            <DescriptionData>\n" +
                "                <Title>"+productTile+"</Title>\n" +
                "                <Brand>"+productWithBLOBs.getBrand()+"</Brand>\n" +
                "                <Description>"+productDesc+"</Description>\n" +
               /* "                <BulletPoint>made in Italy</BulletPoint>\n" +
                "                <BulletPoint>500 thread count</BulletPoint>\n" +
                "                <BulletPoint>plain weave (percale)</BulletPoint>\n" +
                "                <BulletPoint>100% Egyptian cotton</BulletPoint>\n" +*/
               amazonProductKeyDesc+
                "                <Manufacturer>"+productWithBLOBs.getFactoryName()+"</Manufacturer>\n" +
               /* "                <SearchTerms>bedding</SearchTerms>\n" +
                "                <SearchTerms>Sheets</SearchTerms>\n" +*/
                amazonProductKeyWords+
                "                <ItemType>flat-sheets</ItemType>\n" +
                "                <IsGiftWrapAvailable>false</IsGiftWrapAvailable>\n" +
                "                <IsGiftMessageAvailable>false</IsGiftMessageAvailable>\n" +
                "                <RecommendedBrowseNode>60583031</RecommendedBrowseNode>\n" +
                "                <RecommendedBrowseNode>60576021</RecommendedBrowseNode>\n" +
                "            </DescriptionData>\n" +
                "            <ProductData>\n" +
                "                <Home>\n" +
                "                    <Parentage>variation-parent</Parentage>\n" +
                "                    <VariationData>\n" +
                "                        <VariationTheme>Size-Color</VariationTheme>\n" +
                "                    </VariationData>\n" +
                "                    <Material>cotton</Material>\n" +
                "                    <ThreadCount>500</ThreadCount>\n" +
                "                </Home>\n" +
                "            </ProductData>\n" +
                "        </Product>\n" +
                "    </Message>\n" +
                "    <Message>\n" +
                "</AmazonEnvelope>";


    }


    //    产品价格上传-未完待续
    public void productPriceUpload(AmazonAccountInfo amazonAccountInfo , ProductWithBLOBs productWithBLOBs) throws Exception{
        String common = this.common(amazonAccountInfo,"_POST_PRODUCT_PRICING_DATA_");

        HttpClient client = HttpClients.createDefault();

        String requestURLParams=amazonAccountInfo.getAmazonMwsEndpoint()+"?AWSAccessKeyId="+amazonAccountInfo.getAmazonAccessID() +
                "&Action=SubmitFeed" +
                "&FeedType=_POST_PRODUCT_PRICING_DATA_" +
                "&MWSAuthToken="+amazonAccountInfo.getAmazonAccessSecret() +
                "&MarketplaceIdList.Id.1="+amazonAccountInfo.getMarketplaceId() +
                "&SellerId=" +amazonAccountInfo.getSellerId()+
                "&SignatureMethod=HmacSHA256" +
                "&SignatureVersion=2" +
                "&Timestamp=" +this.dateTimeStamp+
                "&Version=2009-01-01" +
                "&Signature=";

        String profitType="";
        String currency="";
        switch(amazonAccountInfo.getAccountCountry()){
            case "英国" :
                profitType="欧元";
                currency="EUR";
                //语句
                break; //可选
            case "法国" :
                profitType="欧元";
                currency="EUR";
                break; //可选
            case "德国" :
                profitType="欧元";
                currency="EUR";
                break; //可选
            case "意大利" :
                profitType="欧元";
                currency="EUR";
                break; //可选
            case "西班牙" :
                profitType="欧元";
                currency="EUR";
                break; //可选
            case "美国" :
                profitType="美元";
                currency="USD";
                break; //可选
            case "加拿大" :
                profitType="美元";
                currency="USD";
                break; //可选
            case "墨西哥" :
                profitType="美元";
                currency="USD";
                break; //可选
            //你可以有任意数量的case语句
            default : //可选
                profitType="美元";
        }

        double price = AmazonStoreProfit.setProfitRate(productWithBLOBs.getCost(), productWithBLOBs.getShippingCost(), profitType);

//        没有完成
        String body="<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<AmazonEnvelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>"+amazonAccountInfo.getMerchantIdentifier()+"</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>Price</MessageType>\n" +
                "    <Message>\n" +
                "        <MessageID>1</MessageID>\n" +
                "        <Price>\n" +
                "            <SKU>"+productWithBLOBs.getParentSkuId()+"</SKU>\n" +
                "            <StandardPrice currency=\""+currency+"\">"+price+"</StandardPrice>\n" +
                "        </Price>\n" +
                "    </Message>\n" +
                "    <Message>\n" +
                "        <MessageID>2</MessageID>\n" +
                "        <Price>\n" +
                "            <SKU>ASUSVNA1669</SKU>\n" +
                "            <StandardPrice currency=\"USD\">204.99</StandardPrice>\n" +
                "            <Sale>\n" +
                "                <StartDate>2008-10-01T00:00:00Z</StartDate>\n" +
                "                <EndDate>2009-01-31T00:00:00Z</EndDate>\n" +
                "                <SalePrice currency=\"USD\">28.38</SalePrice>\n" +
                "            </Sale>\n" +
                "        </Price>\n" +
                "    </Message>\n" +
                "</AmazonEnvelope>";


    }

    //    产品关系上传-未完待续
    public void productRelationshipUpload(AmazonAccountInfo amazonAccountInfo , ProductWithBLOBs productWithBLOBs) throws Exception{
        String common = this.common(amazonAccountInfo,"_POST_PRODUCT_RELATIONSHIP_DATA_");
        HttpClient client = HttpClients.createDefault();

        String requestURLParams=amazonAccountInfo.getAmazonMwsEndpoint()+"?AWSAccessKeyId="+amazonAccountInfo.getAmazonAccessID() +
                "&Action=SubmitFeed" +
                "&FeedType=_POST_PRODUCT_RELATIONSHIP_DATA_" +
                "&MWSAuthToken="+amazonAccountInfo.getAmazonAccessSecret() +
                "&MarketplaceIdList.Id.1="+amazonAccountInfo.getMarketplaceId() +
                "&SellerId=" +amazonAccountInfo.getSellerId()+
                "&SignatureMethod=HmacSHA256" +
                "&SignatureVersion=2" +
                "&Timestamp=" +this.dateTimeStamp+
                "&Version=2009-01-01" +
                "&Signature=";

//        获取变体产品
        List<ProductItem> productItems = productWithBLOBs.getProductItems();
        String tmp="";
        for (int i = 0; i < productItems.size(); i++) {
            tmp+="<Relation>\n" +
                "    <SKU>"+productItems.get(i).getSkuId()+"</SKU>\n" +
                "    <Type>Variation</Type>\n" +
                "</Relation>\n";
        }

        String body="<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<AmazonEnvelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>"+amazonAccountInfo.getMerchantIdentifier()+"</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>Relationship</MessageType>\n" +
                "    <Message>\n" +
                "        <MessageID>1</MessageID>\n" +
                "        <OperationType>Update</OperationType>\n" +
                "        <Relationship>\n" +
                "            <ParentSKU>"+productWithBLOBs.getParentSkuId()+"</ParentSKU>\n" +
                tmp     +
                "        </Relationship>\n" +
                "    </Message>\n" +
                "</AmazonEnvelope>";


    }

    //    产品库存上传-未完待续
    public void productInventoryUpload(AmazonAccountInfo amazonAccountInfo , ProductWithBLOBs productWithBLOBs) throws Exception{
        String common = this.common(amazonAccountInfo,"_POST_INVENTORY_AVAILABILITY_DATA_");
        HttpClient client = HttpClients.createDefault();

        String requestURLParams=amazonAccountInfo.getAmazonMwsEndpoint()+"?AWSAccessKeyId="+amazonAccountInfo.getAmazonAccessID() +
                "&Action=SubmitFeed" +
                "&FeedType=_POST_INVENTORY_AVAILABILITY_DATA_" +
                "&MWSAuthToken="+amazonAccountInfo.getAmazonAccessSecret() +
                "&MarketplaceIdList.Id.1="+amazonAccountInfo.getMarketplaceId() +
                "&SellerId=" +amazonAccountInfo.getSellerId()+
                "&SignatureMethod=HmacSHA256" +
                "&SignatureVersion=2" +
                "&Timestamp=" +this.dateTimeStamp+
                "&Version=2009-01-01" +
                "&Signature=";


        String tmp="    <Message>\n" +
                "        <MessageID>1</MessageID>\n" +
                "        <OperationType>Update</OperationType>\n" +
                "        <Inventory>\n" +
                "            <SKU>"+productWithBLOBs.getParentSkuId()+"</SKU>\n" +
                "            <Quantity>"+productWithBLOBs.getInStore()+"</Quantity>\n" +
                "            <FulfillmentLatency>"+productWithBLOBs.getFulfillmentLatency()+"</FulfillmentLatency>\n" +
                "        </Inventory>\n" +
                "    </Message>\n" ;

        List<ProductItem> productItems = productWithBLOBs.getProductItems();
        for (int i = 0; i < productItems.size(); i++) {
            tmp+="    <Message>\n" +
                    "        <MessageID>"+(i+2)+"</MessageID>\n" +
                    "        <OperationType>Update</OperationType>\n" +
                    "        <Inventory>\n" +
                    "            <SKU>"+productItems.get(i).getSkuId()+"</SKU>\n" +
                    "            <Quantity>"+productItems.get(i).getInventory()+"</Quantity>\n" +
                    "            <FulfillmentLatency>"+productWithBLOBs.getFulfillmentLatency()+"</FulfillmentLatency>\n" +
                    "        </Inventory>\n" +
                    "    </Message>\n" ;
        }


        String body="<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n" +
                "<AmazonEnvelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"amzn-envelope.xsd\">\n" +
                "    <Header>\n" +
                "        <DocumentVersion>1.01</DocumentVersion>\n" +
                "        <MerchantIdentifier>"+amazonAccountInfo.getMerchantIdentifier()+"</MerchantIdentifier>\n" +
                "    </Header>\n" +
                "    <MessageType>Inventory</MessageType>\n" +
                tmp+
                "</AmazonEnvelope>";


    }






}
