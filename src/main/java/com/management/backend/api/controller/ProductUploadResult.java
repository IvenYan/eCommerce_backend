package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.management.backend.api.controller.entity.AmazonProductUploadEntity;
import com.management.backend.api.controller.entity.ProductSimpleBody;
import com.management.backend.api.controller.entity.RequestSearchProduct;
import com.management.backend.api.controller.entity.ResponseBodyEntity;
import com.management.backend.api.mybatis.mapper.AmazonAccountInfoMapper;
import com.management.backend.api.mybatis.mapper.AmazonUploadHistoryMapper;
import com.management.backend.api.mybatis.mapper.AmazonUploadResultMapper;
import com.management.backend.api.mybatis.mapper.ProductMapper;
import com.management.backend.api.mybatis.model.*;
import com.management.backend.api.service.UploadToAmazon;
import com.management.backend.api.util.PageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
public class ProductUploadResult {

    protected static final Logger log = LoggerFactory.getLogger(ProductUploadResult.class);
    private SimpleDateFormat df_date = new SimpleDateFormat("yyyy-MM-dd“”“ HH:mm:ss.SSSS");//设置日期格式


    @Autowired
    private AmazonUploadResultMapper amazonUploadResultMapper;


    @ApiOperation(value="亚马逊-列出所有亚马逊上传结果", notes="",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/amazon/uploadresults")
    public List listAmazonResultList(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        log.info("/amazon/uploadresults start...;");

        if(pageSize==0){
            pageSize=20;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<AmazonUploadResult> amazonUploadResults = amazonUploadResultMapper.selectAll();

//        查询列表的个数
        int countNums = amazonUploadResultMapper.countAll();

        PageBean<AmazonUploadResult> pageData = new PageBean<>(pageNum, pageSize, countNums);
        pageData.setCurrentPage(pageNum);
        pageData.setPageSize(pageSize);
        pageData.setTotalNum(countNums);
        pageData.setItems(amazonUploadResults);

        return pageData.getItems();
    }


}
