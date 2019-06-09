package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.management.backend.api.mybatis.mapper.ProductMapper;
import com.management.backend.api.mybatis.model.Product;
import com.management.backend.api.mybatis.model.ProductExample;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@Api(value = "product operations",tags = {"product service"})
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    @ApiOperation(value="获取产品详细信息", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/products/{productId}")
    public Product getProduct(@PathVariable("productId") int productId){
        Product product = productMapper.selectByPrimaryKey(productId);
        return product;
    }





    @ApiOperation(value="获取产品列表信息", notes="获取所有产品的详细信息",produces="application/json",consumes = "application/json")
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
    }

    @ApiOperation(value="创建产品", notes="创建一个新的产品",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/product")
    public Resp saveProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式;id会自动生成，不用输入",required=true) Product product){
           productMapper.insert(product);
        return   new Resp(product.getId());

    }

    @ApiOperation(value="更新产品", notes="更新一个已存在的产品",produces="application/json",consumes = "application/json")
    @PutMapping(value = "/products/{productId}")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true,paramType = "path", dataType = "Integer")
    public int updateProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式",required=true) Product product,@PathVariable("productId") int productId){
        ProductExample ue = new ProductExample();
        ue.createCriteria().andIdEqualTo(productId);
        product.setId(productId);
        return   productMapper.updateByExample(product,ue);
    }



}
