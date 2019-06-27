package com.management.backend.api.service;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
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

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName UploadToAmazon
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 12:03
 * @Version 1.0
 **/
@Component
public class UploadToAmazon {
    private SimpleDateFormat df_date = new SimpleDateFormat("yyyy-MM-ddTHH:mm:ss.SSSS");//设置日期格式
    private static String amazonAccessID;
    private static String amazonAccessSecret;
//    private static String sellerId;
    private static String marketPlace;

    private static String  amazonEN;
    private static String  amazonNA;
    private static String  amazonDE;
//
//    @Value("${qzx.amazonAccessID}")
//    public static void setSellerId(String sellerId) {        UploadToAmazon.sellerId = sellerId;    }
    @Value("${qzx.amazonAccessID}")
    public static void setMarketPlace(String marketPlace) {        UploadToAmazon.marketPlace = marketPlace;    }
    @Value("${qzx.amazonAccessID}")
    public static void setAmazonEN(String amazonEN) {        UploadToAmazon.amazonEN = amazonEN;    }
    @Value("${qzx.amazonAccessID}")
    public static void setAmazonNA(String amazonNA) {        UploadToAmazon.amazonNA = amazonNA;    }
    @Value("${qzx.amazonAccessID}")
    public static void setAmazonDE(String amazonDE) {        UploadToAmazon.amazonDE = amazonDE;    }

    @Value("${qzx.amazonAccessID}")
    public static void setAmazonAccessID(String amazonAccessID) {
        UploadToAmazon.amazonAccessID = amazonAccessID;
    }
    @Value("${qzx.amazonAccessSecret}")
    public static void setAmazonAccessSecret(String amazonAccessSecret) {
        UploadToAmazon.amazonAccessSecret = amazonAccessSecret;
    }




    public void SubmitFeed(String sellerId) {
        String product_date = df_date.format(new Date());
        HttpClient client = HttpClients.createDefault();

        String requestURLParams="/?AWSAccessKeyId="+amazonAccessID +
                "  &Action=SubmitFeed" +
                "  &FeedType=_POST_PRODUCT_DATA_" +
                "  &MWSAuthToken="+amazonAccessSecret +
                "  &MarketplaceIdList.Id.1="+marketPlace +
                "  &SellerId=" +sellerId+
                "  &SignatureMethod=HmacSHA256" +
                "  &SignatureVersion=2" +
                "  &Timestamp=" +product_date+
                "  &Version=" +
                "  &Signature=SvSExamplefZpSignaturex2cs%3D";

        String body="";

        // 要调用的接口方法
//        String url = "https://api.weixin.qq.com/sns/jscode2session";
//        String getUrl="https://api.weixin.qq.com/sns/jscode2session?appid=" + wechatAppid + "&secret=" + wechatSecret + "&js_code=" + js_code + "&grant_type=client_credentials";
//        HttpPost post = new HttpPost(url);
        HttpPost get = new HttpPost(requestURLParams);
//        JSONObject jsonObject = null;
        try {
//            StringEntity s = new StringEntity(data.toString());
//            s.setContentEncoding("UTF-8");
//            s.setContentType("application/json");
//            post.setEntity(s);

            get.addHeader("content-type", "application/json");
            HttpResponse res = client.execute(get);
            HttpEntity entity = res.getEntity();
//            System.out.println(response1);
            if (res.getStatusLine().getStatusCode() == HttpStatus.OK.value()) {
                String result = EntityUtils.toString(entity);// 返回json格式：
//                jsonObject = JSONObject.parseObject(result);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        return jsonObject;
    }



}
