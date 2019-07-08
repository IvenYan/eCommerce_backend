package com.management.backend.api.controller;

import com.management.backend.api.controller.entity.AmazonProductUploadEntity;
import com.management.backend.api.controller.entity.ResponseBodyEntity;
import com.management.backend.api.mybatis.mapper.AmazonAccountInfoMapper;
import com.management.backend.api.mybatis.mapper.ProductMapper;
import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import com.management.backend.api.mybatis.model.ProductWithBLOBs;
import com.management.backend.api.service.UploadToAmazon;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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


    @Autowired
    private AmazonAccountInfoMapper amazonAccountInfoMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private UploadToAmazon uploadToAmazon;

    @ApiOperation(value="亚马逊-列出所有亚马逊用户", notes="",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/amazon/accounts")
    public List listAmazonAccount() {
        log.info("/amazon/accounts start...;");
        List<AmazonAccountInfo> amazonAccountInfos = amazonAccountInfoMapper.selectList();
        return amazonAccountInfos;

    }


    @ApiOperation(value="亚马逊上传产品", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/amazon/products/upload")
    public ResponseBodyEntity SubmitFeed(@RequestBody @ApiParam(name="上传的产品对象",value="传入json格式;id会自动生成，不用输入",required=true)
                                         AmazonProductUploadEntity amazonProductUploadEntity)throws Exception {
        log.info("/amazon/products/upload start...;accountId="+amazonProductUploadEntity.toString());

        AmazonAccountInfo amazonAccountInfo = amazonAccountInfoMapper.selectByPrimaryKey(amazonProductUploadEntity.getAmazonAccountId());
        ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(Integer.parseInt(amazonProductUploadEntity.getProductId()));
//        productWithBLOBs

//        设置处理天数
        if(Integer.parseInt(amazonProductUploadEntity.getProcessDays())==0){
            productWithBLOBs.setFulfillmentLatency(2);
        }else{
            productWithBLOBs.setFulfillmentLatency(Integer.parseInt(amazonProductUploadEntity.getProcessDays()));
        }
        if(amazonProductUploadEntity.getFactoryName()!=null){
            productWithBLOBs.setFactoryName(amazonProductUploadEntity.getFactoryName());
        }
        if(amazonProductUploadEntity.getFactoryNo()!=null){
            productWithBLOBs.setFactoryNumber(amazonProductUploadEntity.getFactoryNo());
        }

//        productWithBLOBs
//        uploadToAmazon.productAllUpload(amazonAccountInfo,productWithBLOBs,amazonProductUploadEntity);
        String s = uploadToAmazon.productImageUpload(amazonAccountInfo, productWithBLOBs);

        ResponseBodyEntity responseBody = new ResponseBodyEntity();
//        responseBody.setId();
        responseBody.setStatus("200");
        responseBody.setMessage(s);

        return responseBody;
    }


//    弃用
    @ApiOperation(value="亚马逊上传产品测试接口", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/amazon/products/uploadTest")
    public ResponseBodyEntity test(@RequestBody @ApiParam(name="上传的产品对象",value="传入json格式;id会自动生成，不用输入",required=true)
                                               AmazonProductUploadEntity amazonProductUploadEntity)throws Exception {
        log.info("/amazon/products/uploadTest start...;accountId="+amazonProductUploadEntity.toString());

        AmazonAccountInfo amazonAccountInfo = amazonAccountInfoMapper.selectByPrimaryKey(amazonProductUploadEntity.getAmazonAccountId());
        ProductWithBLOBs productWithBLOBs = productMapper.selectByPrimaryKey(Integer.parseInt(amazonProductUploadEntity.getProductId()));
//        设置处理天数
        productWithBLOBs.setFulfillmentLatency(Integer.parseInt(amazonProductUploadEntity.getProcessDays()));
        productWithBLOBs.setFactoryName(amazonProductUploadEntity.getFactoryName());
        productWithBLOBs.setFactoryNumber(amazonProductUploadEntity.getFactoryNo());
//        productWithBLOBs

//        uploadToAmazon.productAllUpload(amazonAccountInfo,productWithBLOBs,amazonProductUploadEntity);
        String s = uploadToAmazon.productImageUpload(amazonAccountInfo, productWithBLOBs);

        ResponseBodyEntity responseBody = new ResponseBodyEntity();
//        responseBody.setId();
        responseBody.setStatus("200");
        responseBody.setMessage(s);

        return responseBody;
    }



}
