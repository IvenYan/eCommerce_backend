package com.management.backend.api.controller.entity;

import java.util.List;

/**
 * @ClassName AmazonProductUploadEntity
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/7/1 21:26
 * @Version 1.0
 **/
public class AmazonProductUploadEntity {

//    产品级别
    private int level;
//    限制条数
    private int limitNumber;
//    产品日期
    private List<String> productDate;
//    产品排序-在用
    private int productSort;
//    产品编号-在用
    private String productId;
//    选择账户-在用
    private int amazonAccountId;
//    处理天数-在用
    private String processDays;
//    产品分类-在用
    private String productType;
    private List<String> prodductTypeList;
//    亚马逊分类-在用
    private String amazonProductType;
    private List<String> amazonProductTypeList;
//    上传模板
    private String uploadTemplate;
//    厂商名称-在用
    private String factoryName;
//    厂商编号-在用
    private String factoryNo;
//    产品品牌
    private String productBrand;
//    标题前缀
    private String titlePrefix;
//    标题后缀
    private String titleSuffix;
//    关键字
    private String keyWords;
//    前面描述
    private String descPrefix;
//    后面描述
    private String descSuffix;
//    描述标签
    private String descTag;


    public List getProdductTypeList() {
        return prodductTypeList;
    }


    public List getAmazonProductTypeList() {
        return amazonProductTypeList;
    }


    public int getAmazonAccountId() {
        return amazonAccountId;
    }

    public void setAmazonAccountId(int amazonAccountId) {
        this.amazonAccountId = amazonAccountId;
    }


    public String getAmazonProductType() {
        return amazonProductType;
    }

    public void setAmazonProductType(String amazonProductType) {
        this.amazonProductType = amazonProductType;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public String getFactoryNo() {
        return factoryNo;
    }

    public void setFactoryNo(String factoryNo) {
        this.factoryNo = factoryNo;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "AmazonProductUploadEntity{" +
                "productId=" + productId +
                ", amazonAccountId=" + amazonAccountId +
                ", processDays=" + processDays +
                ", amazonProductType='" + amazonProductType + '\'' +
                ", factoryName='" + factoryName + '\'' +
                ", factoryNo='" + factoryNo + '\'' +
                ", productType='" + productType + '\'' +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(int limitNumber) {
        this.limitNumber = limitNumber;
    }

    public void setProdductTypeList(List<String> prodductTypeList) {
        this.prodductTypeList = prodductTypeList;
    }

    public void setAmazonProductTypeList(List<String> amazonProductTypeList) {
        this.amazonProductTypeList = amazonProductTypeList;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProcessDays() {
        return processDays;
    }

    public void setProcessDays(String processDays) {
        this.processDays = processDays;
    }

    public List<String> getProductDate() {
        return productDate;
    }

    public void setProductDate(List<String> productDate) {
        this.productDate = productDate;
    }

    public int getProductSort() {
        return productSort;
    }

    public void setProductSort(int productSort) {
        this.productSort = productSort;
    }

    public String getUploadTemplate() {
        return uploadTemplate;
    }

    public void setUploadTemplate(String uploadTemplate) {
        this.uploadTemplate = uploadTemplate;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getTitlePrefix() {
        return titlePrefix;
    }

    public void setTitlePrefix(String titlePrefix) {
        this.titlePrefix = titlePrefix;
    }

    public String getTitleSuffix() {
        return titleSuffix;
    }

    public void setTitleSuffix(String titleSuffix) {
        this.titleSuffix = titleSuffix;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public String getDescPrefix() {
        return descPrefix;
    }

    public void setDescPrefix(String descPrefix) {
        this.descPrefix = descPrefix;
    }

    public String getDescSuffix() {
        return descSuffix;
    }

    public void setDescSuffix(String descSuffix) {
        this.descSuffix = descSuffix;
    }

    public String getDescTag() {
        return descTag;
    }

    public void setDescTag(String descTag) {
        this.descTag = descTag;
    }
}
