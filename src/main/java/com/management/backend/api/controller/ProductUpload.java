package com.management.backend.api.controller;

import com.management.backend.api.mybatis.mapper.AmazonAccountInfoMapper;
import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ProductUpload
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/27 23:02
 * @Version 1.0
 **/
@RestController
@Api(value = "Amazon ProductUpload operations",tags = {"Amazon product upload service"})
public class ProductUpload {

    protected static final Logger log = LoggerFactory.getLogger(ProductUpload.class);
    private SimpleDateFormat df_date = new SimpleDateFormat("yyyy-MM-dd“”“ HH:mm:ss.SSSS");//设置日期格式

    private static String amazonAccessID;
    private static String amazonAccessSecret;
    //    private static String sellerId;
//    private static String marketPlace;

    private static String  amazonEN;
    private static String  amazonNA;
    private static String  amazonDE;
    //
//    @Value("${qzx.amazonAccessID}")
//    public static void setSellerId(String sellerId) {        UploadToAmazon.sellerId = sellerId;    }
//    @Value("${qzx.amazonAccessID}")
//    public static void setMarketPlace(String marketPlace) {        UploadToAmazon.marketPlace = marketPlace;    }
    @Value("${amazon.en}")
    public static void setAmazonEN(String amazonEN) {        ProductUpload.amazonEN = amazonEN;    }
    @Value("${amazon.na}")
    public static void setAmazonNA(String amazonNA) {        ProductUpload.amazonNA = amazonNA;    }
    @Value("${amazon.de}")
    public static void setAmazonDE(String amazonDE) {        ProductUpload.amazonDE = amazonDE;    }
    @Value("${qzx.amazonAccessID}")
    public static void setAmazonAccessID(String amazonAccessID) {        ProductUpload.amazonAccessID = amazonAccessID;    }
    @Value("${qzx.amazonAccessSecret}")
    public static void setAmazonAccessSecret(String amazonAccessSecret) {        ProductUpload.amazonAccessSecret = amazonAccessSecret;    }

    @Autowired
    private AmazonAccountInfoMapper amazonAccountInfoMapper;

    @ApiOperation(value="亚马逊-列出所有亚马逊用户", notes="",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/amazon/accounts")
    public List listAmazonAccount() {
        log.info("/amazon/accounts start...;");
        List<AmazonAccountInfo> amazonAccountInfos = amazonAccountInfoMapper.selectList();
        return amazonAccountInfos;

    }


    @ApiOperation(value="亚马逊上传产品", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/amazon/products/upload")
    public String SubmitFeed(@Param("accountId")  String accountId,@Param("productId")  String productId,@Param("productTypeIds")  String productTypeIds) {
        log.info("/amazon/products/upload start...;accountId="+accountId);




        return "";
    }


}
