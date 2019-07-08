package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.management.backend.api.controller.entity.ProductSimpleBody;
import com.management.backend.api.controller.entity.RequestSearchProduct;
import com.management.backend.api.mybatis.mapper.ProductItemMapper;
import com.management.backend.api.mybatis.mapper.ProductItemTypeMapper;
import com.management.backend.api.mybatis.mapper.ProductSimpleMapper;
import com.management.backend.api.mybatis.model.*;
import com.management.backend.api.mybatis.mapper.ProductMapper;
import com.management.backend.api.util.PageBean;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.*;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@Api(value = "product operations",tags = {"product service"})
public class ProductService {
    protected static final Logger log = LoggerFactory.getLogger(ProductService.class);
    @Value("${linux.image.filepath}")
    private String filepath;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductItemMapper productItemMapper;
    @Autowired
    private ProductItemTypeMapper productItemTypeMapper;
    @Autowired
    private ProductSimpleMapper productSimpleMapper;

    @ApiOperation(value="获取产品详细信息", notes="根据产品的id来获取产品详细信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "productId", value = "产品ID", required = true, dataType = "Integer")
    @GetMapping(value = "/products")
    public Product getProduct(@RequestParam("productId") int productId){
        Product product = productMapper.selectByPrimaryKey(productId);
        List<ProductItem> tmp =new ArrayList<>();
        List<ProductItem> productItems = product.getProductItems();
        for (ProductItem productItem:productItems) {
            ArrayList<String> strings = new ArrayList<>();
            String[] split = productItem.getPictureListString().split(",");
            for (int i = 0; i <split.length ; i++) {
                strings.add(split[i]);
            }
            productItem.setPictureList(strings);
            tmp.add(productItem);
            strings=null;
        }
        product.setProductItems(tmp);
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

        log.info("listProducts: start...;pageNum="+pageNum+";pageSize="+pageSize);
        PageHelper.startPage(pageNum,pageSize);
        List<ProductSimple> allItems = productSimpleMapper.getSimpleProduct();  //包括搜索全部商品
        int countNums = productSimpleMapper.countProduct();            //包括搜索总记录数
        PageBean<ProductSimple> pageData = new PageBean<>(pageNum, pageSize, countNums);
        pageData.setItems(allItems);
//        pageData.setTotalNum(countNums);
        ProductSimpleBody productSimpleBody=new ProductSimpleBody();
        productSimpleBody.setList(pageData.getItems());
        productSimpleBody.setPageNum(pageNum);
        productSimpleBody.setPageSize(pageSize);
        productSimpleBody.setTotal(countNums);
        productSimpleBody.setAudit_status(0);
        productSimpleBody.setLevel(0);
        productSimpleBody.setOnsale(0);

        return productSimpleBody;
    }



    @ApiOperation(value="创建产品", notes="创建一个新的产品",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/product")
    public HashMap saveProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式;id会自动生成，不用输入",required=true) ProductWithBLOBs product){
        /*if(product.getProductInnerName()!=null){

        }*/
        log.info("/product;创建产品;"+product.toString());
//        前端已经操作修改
        /*String pictureListTmp = product.getPictureList().toString();
        String productTypeTmp=product.getProductTypeIds().toString();
        pictureListTmp=pictureListTmp.substring(1,pictureListTmp.length()-1);
        productTypeTmp=productTypeTmp.substring(1,productTypeTmp.length()-1);
        product.setPictureListString(pictureListTmp);
        product.setProductTypeIdsString(productTypeTmp);*/
//设置父SKU
        product.setParentSkuId(UUID.randomUUID().toString());
        //返回父产品id

        int insert = productMapper.insert(product);
        List<ProductItem> productItems = product.getProductItems();
        List<ProductItemType> productItemTypeList = product.getProductItemTypeList();
        for (ProductItemType productItemType:productItemTypeList) {
            productItemType.setPid(product.getId());

            /*String imtPictureListTmp = productItem.getPictureList().toString();
            imtPictureListTmp=imtPictureListTmp.substring(1,imtPictureListTmp.length()-1);
            productItem.setPictureListString(imtPictureListTmp);*/
            productItemTypeMapper.insert(productItemType);
        }
        for (ProductItem productItem:productItems) {

//            设置SKU ID
            if(productItem.getSkuId()==null){
                productItem.setSkuId(UUID.randomUUID().toString());
            }
//            设置父ID
            productItem.setPid(product.getId());
//            设置List转字符串
            String imtPictureListTmp = productItem.getPictureList().toString();
            imtPictureListTmp=imtPictureListTmp.substring(1,imtPictureListTmp.length()-1);
            productItem.setPictureListString(imtPictureListTmp);

            productItemMapper.insert(productItem);
        }

        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id",product.getId());
        objectObjectHashMap.put("status","200");
        objectObjectHashMap.put("message","product had been add successfully");

        return   objectObjectHashMap;

    }


    @ApiOperation(value="修改产品", notes="修改一个产品",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/product/update")
    public HashMap updateProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式;id会自动生成，不用输入",required=true) ProductWithBLOBs product){
        /*if(product.getProductInnerName()!=null){

        }*/
        log.info("修改产品:"+product.toString());

//返回父产品id
        int insert = productMapper.updateByPrimaryKeySelective(product);
//先删除，再添加
        productItemTypeMapper.deleteByPid(product.getId());
        productItemMapper.deleteByPid(product.getId());

        List<ProductItem> productItems = product.getProductItems();
        log.info("/product/update process;productItems 个数="+productItems.size()+";");
        List<ProductItemType> productItemTypeList = product.getProductItemTypeList();
        for (ProductItemType productItemType:productItemTypeList) {
            productItemType.setPid(product.getId());
            productItemTypeMapper.insert(productItemType);
        }

        productItemMapper.deleteByPid(product.getId());
        for (ProductItem productItem:productItems) {
            log.info("/product/update process;name="+productItem.getName()+";getSkuId="+productItem.getSkuId());
            productItem.setPid(product.getId());
//            设置SKU ID
            if(productItem.getSkuId()==null){
                productItem.setSkuId(UUID.randomUUID().toString());
            }
            String imtPictureListTmp = productItem.getPictureList().toString();
            imtPictureListTmp=imtPictureListTmp.substring(1,imtPictureListTmp.length()-1);
            productItem.setPictureListString(imtPictureListTmp);
            productItemMapper.insert(productItem);
        }
        HashMap<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("id",product.getId());
        objectObjectHashMap.put("status","200");
        objectObjectHashMap.put("message","product had been add successfully");

        return   objectObjectHashMap;

    }

//    搜索产品
    @ApiOperation(value="搜索产品", notes="搜索一个产品",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/product/search")
    public ProductSimpleBody searchProduct(@RequestBody @ApiParam(name="产品对象",value="传入json格式;id会自动生成，不用输入",required=true)RequestSearchProduct requestSearchProduct){
        /*if(product.getProductInnerName()!=null){

        }*/
//        valuecascader:类型；marray:时间区间；valued：用户id；inputbh：产品id；inputOther：其他输入；audit_status：上传状态；onsale：上下架；level：产品级别，原创还是重点
        log.info("/product/search start:"+requestSearchProduct.toString());
//        List<String> valuecascader = requestSearchProduct.getValuecascader();
        String[] split = requestSearchProduct.getMarray().split(",");
        String tmp1="";
        if("".equals(requestSearchProduct.getValuecascader())){
            requestSearchProduct.setValuecascader(null);
        }

        PageHelper.startPage(requestSearchProduct.getPageNum(),requestSearchProduct.getPageSize());
//        查询列表
        List<ProductSimple> tmp= productSimpleMapper.selectByCondition(requestSearchProduct.getValuecascader(),
                split.length>1?split[0]:null,split.length>2?split[1]:null,
                requestSearchProduct.getValued(), requestSearchProduct.getInputbh(),requestSearchProduct.getInputOther(),requestSearchProduct.getAudit_status(),
                requestSearchProduct.getOnsale(), requestSearchProduct.getLevel());
//        查询列表的个数
        int countNums = productSimpleMapper.countSelectByCondition(requestSearchProduct.getValuecascader(),
                split.length > 1 ? split[0] : null, split.length > 2 ? split[1] : null,
                requestSearchProduct.getValued(), requestSearchProduct.getInputbh(), requestSearchProduct.getInputOther(), requestSearchProduct.getAudit_status(),
                requestSearchProduct.getOnsale(), requestSearchProduct.getLevel());

        PageBean<ProductSimple> pageData = new PageBean<>(requestSearchProduct.getPageNum(), requestSearchProduct.getPageSize(), countNums);
        pageData.setItems(tmp);
//        pageData.setTotalNum(countNums);
        ProductSimpleBody productSimpleBody=new ProductSimpleBody();
        productSimpleBody.setList(pageData.getItems());
        productSimpleBody.setPageNum(requestSearchProduct.getPageNum());
        productSimpleBody.setPageSize(requestSearchProduct.getPageSize());
        productSimpleBody.setTotal(countNums);
        int searchCountByAuditStatus = productSimpleMapper.searchCountByAuditStatus(requestSearchProduct.getAudit_status());
        int searchCountByLevel = productSimpleMapper.searchCountByLevel(requestSearchProduct.getLevel());
        int searchCountByOnsale = productSimpleMapper.searchCountByOnsale(requestSearchProduct.getOnsale());

        productSimpleBody.setAudit_status(searchCountByAuditStatus);
        productSimpleBody.setLevel(searchCountByLevel);
        productSimpleBody.setOnsale(searchCountByOnsale);

        return   productSimpleBody;
    }

    @ApiOperation(value="列出最近一天的产品id", notes="",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/products/recently")
    public List listRecentlyProducts() {
        log.info("/products/recently start...");
        Date date = new Date();
        SimpleDateFormat df_date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_MONTH, -1);//+1今天的时间加一天
        date = calendar.getTime();
        String curDateStr = df_date.format(date);

        List<Integer> integers = productSimpleMapper.listRecentlyProducts(curDateStr);

        return   integers;

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
    @PostMapping("/product/image/uploadList")
    @ApiOperation(value="多张图片上传功能", notes="")
    @ApiImplicitParam(name = "files", value = "上传的图片文件", required = true, dataType = "MultipartFile")
    public HashMap imageuploadList(@RequestParam(value = "file") MultipartFile[] files) throws Exception {
        log.info("imageuploadList: start... ,file=");
        HashMap<String,Object> hashMap=null;
        ArrayList<String> fileNameTmp=new ArrayList<String>();
        for (MultipartFile file:files) {
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
            fileNameTmp.add(fileName);
        }

        hashMap=new HashMap<>();
        hashMap.put("imageName",fileNameTmp);
        hashMap.put("status","200");
        hashMap.put("message","images had been upload successfully");

        return hashMap;
    }

    //图片上传功能
    @PostMapping("/product/image/upload")
    @ApiOperation(value="图片上传功能", notes="")
    @ApiImplicitParam(name = "file", value = "上传的图片文件", required = true, dataType = "File")
    public HashMap imageUpload(@RequestParam(value = "file") MultipartFile file) throws Exception {
        log.info("imageUpload: start... ,file=");
        HashMap<String,Object> hashMap=null;
        ArrayList<String> fileNameTmp=new ArrayList<String>();
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
            fileNameTmp.add(fileName);
        hashMap=new HashMap<>();
        hashMap.put("imageName",fileNameTmp);
        hashMap.put("status","200");
        hashMap.put("message","images had been upload successfully");

        return hashMap;
    }

}
