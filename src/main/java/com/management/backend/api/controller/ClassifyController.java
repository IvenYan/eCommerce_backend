package com.management.backend.api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.management.backend.api.controller.entity.ResponseBodyEntity;
import com.management.backend.api.mybatis.mapper.AmazonClassifyMapper;
import com.management.backend.api.mybatis.mapper.AmazonProductClassifyMapper;
import com.management.backend.api.mybatis.mapper.ClassifyMapper;
import com.management.backend.api.mybatis.model.AmazonClassify;
import com.management.backend.api.mybatis.model.AmazonProductClassify;
import com.management.backend.api.mybatis.model.Classify;
import com.management.backend.api.mybatis.model.Product;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
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
    @Autowired
    private AmazonProductClassifyMapper amazonProductClassifyMapper;
//    @Value("${linux.json}")
    @Value("${windows.home.classifyjson}")
    private String filepath;

    @ApiOperation(value="亚马逊-上传产品-分类-单个父级", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/{pid}")
    public List<Classify> getClassify(@PathVariable("pid") int pid){
//pid 默认为pid

        List<Classify> list0 = classifyMapper.selectByPid(pid);
        return list0;
    }

    @ApiOperation(value="亚马逊-上传产品-亚马逊分类-单个父级", notes="根据亚马逊产品的pid来获取亚马逊产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/amazon/{pid}")
    public List<AmazonClassify> getAmazonClassify(@PathVariable("pid") int pid){
        log.info("/products/classify/amazon/"+pid+" :start,");
        List<AmazonClassify> amazonClassifies = amazonClassifyMapper.selectByPid(pid);
        return amazonClassifies;
    }

    @ApiOperation(value="亚马逊-上传产品-亚马逊分类-查找", notes="根据亚马逊产品的名字来获取亚马逊产品分类信息",produces="application/json",consumes = "application/json")
//    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classify/amazon/search")
    public List<AmazonClassify> getAmazonClassifyByName(@RequestParam("searchName") String searchName){
        log.info("/products/classify/amazon/search/"+searchName+" :start,");
        if(searchName!=null){
            searchName="%"+searchName+"%";
        }else{
            return null;
        }
        List<AmazonClassify> amazonClassifies = amazonClassifyMapper.selectBySearchName(searchName);
        return amazonClassifies;
    }

    @ApiOperation(value="亚马逊-上传产品-分类-全量(数据库实时)", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
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

    @ApiOperation(value="亚马逊-上传产品-分类-全量(固定文本)", notes="根据产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
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

//    测试专用-v11
    @ApiOperation(value="亚马逊-上传产品-亚马逊分类-全量(数据库实时-刷新专用)", notes="根据亚马逊产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/amazon/{pid}")
    public ResponseBodyEntity getAmazonClassifyListVersion2(@PathVariable("pid") int pid)throws Exception {
//pid 默认为pid
        ResponseBodyEntity responseBodyEntity = new ResponseBodyEntity();
        final ObjectMapper MAPPER = new ObjectMapper();
        List<AmazonClassify> list0 = amazonClassifyMapper.selectAmazonProductClassifyV2ByPid(pid);
//        递归查找子文件
        demoFunction(list0);

        String string = MAPPER.writeValueAsString(list0);
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好

            fwriter = new FileWriter(filepath+"/amazonClassifyv2.json", false);
            fwriter.write(string);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
                responseBodyEntity.setMessage(ex.getMessage());
                responseBodyEntity.setStatus("500");
                return responseBodyEntity;
            }
        }
//        return string;

        responseBodyEntity.setStatus("200");
        responseBodyEntity.setMessage("更新json文件成功");
        return responseBodyEntity;
    }

//    测试专用-v11
    private void demoFunction(List<AmazonClassify> list){
        for(AmazonClassify item:list ){
            log.debug("demoFunction="+item.getId()+";"+item.getValue());
            List<AmazonClassify> list1 = amazonClassifyMapper.selectAmazonProductClassifyV2ByPid(item.getId());
            if(list1.size()>0){
                item.setChildren(list1);
                demoFunction(list1);
            }else{
                continue;
            }
        }
//        return
    }

    @ApiOperation(value="亚马逊-上传产品-亚马逊分类-全量(固定文本)", notes="根据亚马逊产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "pid", value = "产品父级ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/classifyall/amazon/v2/{pid}")
    public StringBuilder getAmazonClassifyListV2(@PathVariable("pid") int pid)throws Exception {
//pid 默认为pid
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File(filepath + "/amazonClassifyv2.json");

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String tmp="";
        while((tmp=bufferedReader.readLine())!=null){
            stringBuilder.append(tmp);
        }
        return stringBuilder;
    }


//    亚马逊分类写表操作
    @ApiOperation(value="亚马逊-自己测试，更新数据库使用", notes="根据亚马逊产品的pid来获取产品分类信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "startId", value = "要开始的id", required = true, paramType = "path",dataType = "int")
    @GetMapping(value = "/products/classifyall/amazon/v2/test/updateTable/{startId}")
    public StringBuilder setAmazonClassifyListV2(@PathVariable("startId") int startId){
//pid 默认为pid
        log.info("/products/classifyall/amazon/v2/test/updateTable");

        //        int tmp=19667;
        int tmp=19667;
        // 普通方式初始化
        hwj.GoogleApi googleApi = new hwj.GoogleApi();
        // 通过代理
//        GoogleApi googleApi = new GoogleApi("122.224.227.202", 3128);
        AmazonProductClassify amazonProductClassify =null;
        String nodepath ="";
        String tmp_str ="";
        String before="";
        String after="";
        String result_after ="";
        String before1="";
        String after1="";
        String result_after1 ="";
        int i1=0;
        int i2 =0;
        try {
            for (int i = startId; i < tmp; i++) {
                amazonProductClassify = amazonProductClassifyMapper.selectByPrimaryKey(i);
                nodepath = amazonProductClassify.getNodepath();
                i1 = nodepath.lastIndexOf("/");

                log.info("id="+i);
                /*if(i%100==0){
                    Thread.sleep(10000);
                }*/
                Thread.sleep(500);
                if(i1==-1){
                    log.info("pid=0");
                    tmp_str = googleApi.translate(amazonProductClassify.getNodepath(), "zh");
                    amazonProductClassifyMapper.updatePidAndChineseName(i,0,tmp_str);
                }else{
                    before=nodepath.substring(0,i1);
                    after=nodepath.substring(i1,nodepath.length());
    //                log.info("nodepath="+nodepath+";before="+before+";after="+after);
                    AmazonProductClassify amazonProductClassify1 = amazonProductClassifyMapper.selectByNodePath(before);
                    if(after.startsWith("/")){
                        after=after.substring(1,after.length());
                    }

                    result_after = googleApi.translate(after, "zh");
                    if(amazonProductClassify1==null){
                        log.info("error record="+i);
                        i2 = before.lastIndexOf("/");
                        before1=before.substring(0,i2);
                        after1=before.substring(i2,before.length());
                        log.info("nodepath="+before+";before="+before1+";after="+after1);
                        AmazonProductClassify amazonProductClassify12 = amazonProductClassifyMapper.selectByNodePath(before1);
                        result_after1 = googleApi.translate(after1, "zh");
                        log.info(result_after+'/'+result_after1);
                        amazonProductClassifyMapper.updatePidAndNodeType(i,amazonProductClassify12.getId(),after+'/'+after1,result_after+'/'+result_after1);
                    }else {
                        log.info("result_after="+result_after);
                        amazonProductClassifyMapper.updatePidAndNodeType(i,amazonProductClassify1.getId(),after,result_after);
                    }
                }

            }
        } catch (Exception e) {
//            e.printStackTrace();
            log.error("Exception:please recall api");
        }
        return null;
    }


}
