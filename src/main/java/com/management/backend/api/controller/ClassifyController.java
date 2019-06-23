package com.management.backend.api.controller;

import com.management.backend.api.mybatis.mapper.ClassifyMapper;
import com.management.backend.api.mybatis.model.Classify;
import com.management.backend.api.mybatis.model.Product;
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
 * @ClassName Classify
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 17:50
 * @Version 1.0
 **/
@RestController
@Api(value = "Classify operations",tags = {"product service"})
public class ClassifyController {
    protected static final Logger log = LoggerFactory.getLogger(ClassifyController.class);
//    @Value("${windows.home.image.filepath}")
//    private String filepath;

    @Autowired
    private ClassifyMapper classifyMapper;


    @ApiOperation(value="获取产品分类", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/{pid}")
    public List<Classify> getProduct(@PathVariable("pid") int pid){
//pid 默认为pid

        List<Classify> classify = classifyMapper.selectByPid(pid);
        return classify;
    }
}
