package com.management.backend.api.controller;

import com.management.backend.api.mybatis.mapper.AmazonAccountInfoMapper;
import com.management.backend.api.mybatis.mapper.ClassifyMapper;
import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import com.management.backend.api.mybatis.model.Classify;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName AmazonAccount
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/29 20:10
 * @Version 1.0
 **/

@RestController
@Api(value = "AmazonAccount operations",tags = {"AmazonAccount service"})
public class AmazonAccount {
    protected static final Logger log = LoggerFactory.getLogger(AmazonAccount.class);
//    @Value("${windows.home.image.filepath}")
//    private String filepath;

    @Autowired
    private AmazonAccountInfoMapper amazonAccountInfoMapper;


    /*@ApiOperation(value="获取产品分类-单个父级", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/{pid}")
    public List getAmazonAccountInfos(){
//pid 默认为pid

        List<AmazonAccountInfo> amazonAccountInfos = amazonAccountInfoMapper.selectList();
        return amazonAccountInfos;
    }*/

}
