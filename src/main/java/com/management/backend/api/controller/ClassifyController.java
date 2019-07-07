package com.management.backend.api.controller;

import com.management.backend.api.mybatis.mapper.AmazonClassifyMapper;
import com.management.backend.api.mybatis.mapper.ClassifyMapper;
import com.management.backend.api.mybatis.model.AmazonClassify;
import com.management.backend.api.mybatis.model.Classify;
import com.management.backend.api.mybatis.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

/**
 * @ClassName Classify
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 17:50
 * @Version 1.0
 **/
@RestController
@Api(value = "Classify operations",tags = {"Classify service"})
public class ClassifyController {
    protected static final Logger log = LoggerFactory.getLogger(ClassifyController.class);
//    @Value("${windows.home.image.filepath}")
//    private String filepath;

    @Autowired
    private ClassifyMapper classifyMapper;
    @Autowired
    private AmazonClassifyMapper amazonClassifyMapper;


    @ApiOperation(value="获取产品分类-单个父级", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/{pid}")
    public List<Classify> getClassify(@PathVariable("pid") int pid){
//pid 默认为pid

        List<Classify> list0 = classifyMapper.selectByPid(pid);
        return list0;
    }

    @ApiOperation(value="获取亚马逊分类-单个父级", notes="根据亚马逊产品的pid来获取亚马逊产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/amazon/{pid}")
    public List<AmazonClassify> getAmazonClassify(@PathVariable("pid") int pid){
        log.info("/products/classify/amazon/"+pid+" :start,");
        List<AmazonClassify> amazonClassifies = amazonClassifyMapper.selectByPid(pid);
        return amazonClassifies;
    }

    @ApiOperation(value="获取产品分类-全量", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/{pid}")
    public StringBuilder getProduct(@PathVariable("pid") int pid)throws Exception{
//pid 默认为pid
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = this.getClass().getResourceAsStream("/classifyv2.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        String tmp="";
        while((tmp=bufferedReader.readLine())!=null){
            stringBuilder.append(tmp);
        }


        return stringBuilder;

        /*
//        核心算法
        List<Classify> list0 = classifyMapper.selectByPid(pid);
        int i=0;
        for(Classify item:list0 ){
            System.out.println(i++);
            List<Classify> list1 = classifyMapper.selectByPid(item.getValue());
            if(list1.size()>0){
                item.setChildren(list1);
                for(Classify item1:list1 ){
                    System.out.println(i++);
                    List<Classify> list2 = classifyMapper.selectByPid(item1.getValue());
                    if(list2.size()>0){
                        item1.setChildren(list2);
                        for(Classify item2:list2 ){
                            System.out.println(i++);
                            List<Classify> list3 = classifyMapper.selectByPid(item2.getValue());
                            if(list3.size()>0){
                                item2.setChildren(list3);
                            }else{
                                continue;
                            }
                        }
                    }else{
                        continue;
                    }
                }
            }else{
                continue;
            }
        }

        return list0;*/
    }

    @ApiOperation(value="获取产品分类-全量", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/v2/{pid}")
    public List getClassifyList(@PathVariable("pid") int pid)throws Exception {
//pid 默认为pid

        List<Classify> list0 = classifyMapper.selectByPid(pid);
        int i=0;
        for(Classify item:list0 ){
            System.out.println(i++);
            List<Classify> list1 = classifyMapper.selectByPid(item.getId());
            if(list1.size()>0){
                item.setChildren(list1);
                for(Classify item1:list1 ){
                    System.out.println(i++);
                    List<Classify> list2 = classifyMapper.selectByPid(item1.getId());
                    if(list2.size()>0){
                        item1.setChildren(list2);
                        for(Classify item2:list2 ){
                            System.out.println(i++);
                            List<Classify> list3 = classifyMapper.selectByPid(item2.getId());
                            if(list3.size()>0){
                                item2.setChildren(list3);
                            }else{
                                continue;
                            }
                        }
                    }else{
                        continue;
                    }
                }
            }else{
                continue;
            }
        }

        return list0;
    }

    @ApiOperation(value="获取亚马逊产品分类-全量", notes="根据亚马逊产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/amazon/{pid}")
    public List getAmazonClassifyList(@PathVariable("pid") int pid)throws Exception {
//pid 默认为pid

        List<AmazonClassify> list0 = amazonClassifyMapper.selectByPid(pid);
        int i=0;
        for(AmazonClassify item:list0 ){
            System.out.println(i++);
            List<AmazonClassify> list1 = amazonClassifyMapper.selectByPid(item.getId());
            if(list1.size()>0){
                item.setChildren(list1);
                for(AmazonClassify item1:list1 ){
                    System.out.println(i++);
                    List<AmazonClassify> list2 = amazonClassifyMapper.selectByPid(item1.getId());
                    if(list2.size()>0){
                        item1.setChildren(list2);
                        for(AmazonClassify item2:list2 ){
                            System.out.println(i++);
                            List<AmazonClassify> list3 = amazonClassifyMapper.selectByPid(item2.getId());
                            if(list3.size()>0){
                                item2.setChildren(list3);
                            }else{
                                continue;
                            }
                        }
                    }else{
                        continue;
                    }
                }
            }else{
                continue;
            }
        }

        return list0;
    }


    @ApiOperation(value="获取亚马逊产品分类-全量V2", notes="根据亚马逊产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/amazon/v2/{pid}")
    public StringBuilder getAmazonClassifyListV2(@PathVariable("pid") int pid)throws Exception {
//pid 默认为pid
        StringBuilder stringBuilder = new StringBuilder();
        InputStream inputStream = this.getClass().getResourceAsStream("/amazonClassifyv2.json");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        String tmp="";
        while((tmp=bufferedReader.readLine())!=null){
            stringBuilder.append(tmp);
        }

        return stringBuilder;
    }

}
