package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.management.backend.api.controller.entity.ProductSimpleBody;
import com.management.backend.api.mybatis.mapper.AmazonProductStandardNoMapper;
import com.management.backend.api.mybatis.model.AmazonProductStandardNo;
import com.management.backend.api.mybatis.model.ProductSimple;
import com.management.backend.api.util.PageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AmazonProductStandardNo
 * @Description 亚马逊 UPC 上传
 * @Author IvenYan
 * @Date 2019/9/15 9:22
 * @Version 1.0
 **/
@RestController
@RequestMapping("/amazon/standardno/")
@Api(value = "Amazon AmazonProductNumber operations",tags = {"Amazon product number upload service"})
public class AmazonProductStandardNoController {

    protected static final Logger log = LoggerFactory.getLogger(AmazonProductStandardNoController.class);
    @Autowired
    private AmazonProductStandardNoMapper amazonProductStandardNoMapper;

    @ApiOperation(value="亚马逊-UPC", notes="",produces="application/json",consumes = "application/json")
    @GetMapping(value = "numbers")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "获取的页码", required = true,paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页数据条数", required = true,paramType = "query", dataType = "int")
    })
    public PageBean listAmazonStandardNumber(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize) {
        log.info("/amazon/standardno/numbers start...;");
        PageHelper.startPage(pageNum, pageSize);
        PageHelper.orderBy("id desc");
        List<AmazonProductStandardNo> amazonProductStandardNoControllers = amazonProductStandardNoMapper.listAmazonStandardNo();
        int count = (int)PageHelper.count(amazonProductStandardNoMapper);
        PageBean pageData=new PageBean<AmazonProductStandardNo>(pageNum, pageSize,count);
        pageData.setItems(amazonProductStandardNoControllers);
//        pageData.setTotalNum(countNums);

        return pageData;
    }





}
