package com.management.backend.api.mybatis.model;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Product {
    private Integer id;

    private Date creatTime;

    private int auditStatus;

    private int onsale;

    private int level;

    private Integer userId;

    private String brand;

    private String factoryName;

    private String sourceArea;

    private String factoryNumber;

    private String factoryCatalog;

    private int uploadForbiden;

    private String sourceUrl;

    private String comments;

    private Float cost;

    private Float shippingCost;

    private String customCode;

    private String engDesc;

    private String declarePrice;

    private String chDesc;

    private String innerSku;

    private int suitForGroup;

    private String productMaterial;

    private String packetMaterial;

    private String metalType;

    private String jewelType;

    private String packageGrossWeight;

    private int hasBattery;

    private Float packageLong;

    private Float packageWidth;

    private Float packageHight;

    private Long inStore;

    private Long countPerPackage;

//    以数组形势传进来
    private List<Integer> productTypeIds;


//变体
    private HashMap<String,List<ProductInner>> productInnerName;

    public HashMap<String, List<ProductInner>> getProductInnerName() {
        return productInnerName;
    }

    public void setProductInnerName(HashMap<String, List<ProductInner>> productInnerName) {
        this.productInnerName = productInnerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    public String getSourceArea() {
        return sourceArea;
    }

    public void setSourceArea(String sourceArea) {
        this.sourceArea = sourceArea == null ? null : sourceArea.trim();
    }

    public String getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(String factoryNumber) {
        this.factoryNumber = factoryNumber == null ? null : factoryNumber.trim();
    }

    public String getFactoryCatalog() {
        return factoryCatalog;
    }

    public void setFactoryCatalog(String factoryCatalog) {
        this.factoryCatalog = factoryCatalog == null ? null : factoryCatalog.trim();
    }


    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl == null ? null : sourceUrl.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getCustomCode() {
        return customCode;
    }

    public void setCustomCode(String customCode) {
        this.customCode = customCode == null ? null : customCode.trim();
    }

    public String getEngDesc() {
        return engDesc;
    }

    public void setEngDesc(String engDesc) {
        this.engDesc = engDesc == null ? null : engDesc.trim();
    }

    public String getDeclarePrice() {
        return declarePrice;
    }

    public void setDeclarePrice(String declarePrice) {
        this.declarePrice = declarePrice == null ? null : declarePrice.trim();
    }

    public String getChDesc() {
        return chDesc;
    }

    public void setChDesc(String chDesc) {
        this.chDesc = chDesc == null ? null : chDesc.trim();
    }

    public String getInnerSku() {
        return innerSku;
    }

    public void setInnerSku(String innerSku) {
        this.innerSku = innerSku == null ? null : innerSku.trim();
    }

    public int getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(int auditStatus) {
        this.auditStatus = auditStatus;
    }

    public int getOnsale() {
        return onsale;
    }

    public void setOnsale(int onsale) {
        this.onsale = onsale;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getUploadForbiden() {
        return uploadForbiden;
    }

    public void setUploadForbiden(int uploadForbiden) {
        this.uploadForbiden = uploadForbiden;
    }

    public int getSuitForGroup() {
        return suitForGroup;
    }

    public void setSuitForGroup(int suitForGroup) {
        this.suitForGroup = suitForGroup;
    }

    public void setHasBattery(int hasBattery) {
        this.hasBattery = hasBattery;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial == null ? null : productMaterial.trim();
    }

    public String getPacketMaterial() {
        return packetMaterial;
    }

    public void setPacketMaterial(String packetMaterial) {
        this.packetMaterial = packetMaterial == null ? null : packetMaterial.trim();
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType == null ? null : metalType.trim();
    }

    public String getJewelType() {
        return jewelType;
    }

    public void setJewelType(String jewelType) {
        this.jewelType = jewelType == null ? null : jewelType.trim();
    }

    public String getPackageGrossWeight() {
        return packageGrossWeight;
    }

    public void setPackageGrossWeight(String packageGrossWeight) {
        this.packageGrossWeight = packageGrossWeight == null ? null : packageGrossWeight.trim();
    }

    public int getHasBattery() {
        return hasBattery;
    }

    public Float getPackageLong() {
        return packageLong;
    }

    public void setPackageLong(Float packageLong) {
        this.packageLong = packageLong;
    }

    public Float getPackageWidth() {
        return packageWidth;
    }

    public void setPackageWidth(Float packageWidth) {
        this.packageWidth = packageWidth;
    }

    public Float getPackageHight() {
        return packageHight;
    }

    public void setPackageHight(Float packageHight) {
        this.packageHight = packageHight;
    }

    public Long getInStore() {
        return inStore;
    }

    public void setInStore(Long inStore) {
        this.inStore = inStore;
    }

    public Long getCountPerPackage() {
        return countPerPackage;
    }

    public void setCountPerPackage(Long countPerPackage) {
        this.countPerPackage = countPerPackage;
    }

    public List<Integer> getProductTypeIds() {
        return productTypeIds;
    }

    public void setProductTypeIds(List<Integer> productTypeIds) {
        this.productTypeIds = productTypeIds;
    }
}