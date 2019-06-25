package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.management.backend.api.controller.entity.ProductSimpleBody;
import com.management.backend.api.mybatis.mapper.ProductSimpleMapper;
import com.management.backend.api.mybatis.model.ProductSimple;
import com.management.backend.api.mybatis.mapper.ProductMapper;
import com.management.backend.api.mybatis.model.Product;
import com.management.backend.api.mybatis.model.ProductWithBLOBs;
import com.management.backend.api.util.PageBean;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@RestController
@Api(value = "product operations",tags = {"product service"})
public class ProductService {
    protected static final Logger log = LoggerFactory.getLogger(ProductService.class);
    @Value("${linux.image.filepath}")
    private String filepath;
    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductSimpleMapper productSimpleMapper;

    @ApiOperation(value="获取产品详细信息", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/{productId}")
    public Product getProduct(@PathVariable("productId") int productId){
        Product product = productMapper.selectByPrimaryKey(productId);
        return product;
    }


    /*@ApiOperation(value="获取产品列表信息", notes="获取所有产品的详细信息",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/products")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "获取的页码", required = true,paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页数据条数", required = true,paramType = "query", dataType = "int")
    })
    public PageInfo<Product> getProducts(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum,pageSize);

        ArrayList<Product> products = (ArrayList<Product>)productMapper.selectByExample(new ProductExample());
        PageInfo<Product> appsPageInfo = new PageInfo<Product>(products);
        return appsPageInfo;
    }*/

    @ApiOperation(value="YK:获取产品列表信息", notes="获取所有产品的详细信息",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/listProducts")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "获取的页码", required = true,paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页数据条数", required = true,paramType = "query", dataType = "int")
    })
    public ProductSimpleBody listProducts(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum,pageSize);


        log.info("listProducts: start...");
        List<ProductSimple> allItems = productSimpleMapper.getSimpleProduct();  //包括搜索全部商品
        int countNums = productSimpleMapper.countProduct();            //包括搜索总记录数
        PageBean<ProductSimple> pageData = new PageBean<>(pageNum, pageSize, countNums);
        pageData.setItems(allItems);
        ProductSimpleBody productSimpleBody=new ProductSimpleBody();
        productSimpleBody.setList(pageData.getItems());
        productSimpleBody.setPageNum(pageNum);
        productSimpleBody.setPageSize(pageSize);
        productSimpleBody.setTotal(allItems.size());

        return productSimpleBody;

    }



    @ApiOperation(value="创建产品", notes="创建一个新的产品",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/product")
    public Resp saveProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式;id会自动生成，不用输入",required=true) ProductWithBLOBs product){
           productMapper.insert(product);
        return   new Resp(product.getId());

    }

    /*@ApiOperation(value="更新产品", notes="更新一个已存在的产品",produces="application/json",consumes = "application/json")
    @PutMapping(value = "/products/{productId}")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true,paramType = "path", dataType = "Integer")
    public int updateProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式",required=true) Product product,@PathVariable("productId") int productId){
        ProductExample ue = new ProductExample();
        ue.createCriteria().andIdEqualTo(productId);
        product.setId(productId);
        return   productMapper.updateByExample(product,ue);
    }*/

    //图片上传功能
    @PostMapping("/product/image/upload")
    @ApiOperation(value="图片上传功能", notes="")
    @ApiImplicitParam(name = "file", value = "上传的图片文件", required = true, dataType = "File")
    public HashMap imageUpload(@RequestParam(value = "file") MultipartFile file) throws Exception {
        log.info("imageUpload: start... ,file=");
        HashMap<String,String> hashMap=null;
        if (file.isEmpty()) {
            log.info("imageUpload: start... ,文件为空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        fileName = UUID.randomUUID() + suffixName; // 新文件名
        File dest = new File(this.filepath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);

        } catch (IOException e) {
            e.printStackTrace();
        }
        hashMap=new HashMap<>();
        hashMap.put("imageName",fileName);

        return hashMap;
    }

}
