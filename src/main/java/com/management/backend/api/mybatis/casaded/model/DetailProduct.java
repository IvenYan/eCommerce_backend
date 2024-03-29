package com.management.backend.api.mybatis.casaded.model;

import com.management.backend.api.mybatis.model.User;
import com.management.backend.api.mybatis.model.ProductDetail;
import com.management.backend.api.mybatis.model.ProductPicture;
import com.management.backend.api.mybatis.model.ProductType;

import java.util.Date;
import java.util.List;

public class DetailProduct {
    private Integer id;

    private Date creatTime;

    private Boolean auditStatus;

    private Boolean onsale;

    private Boolean level;

    private String brand;

    private String factoryName;

    private String sourceArea;

    private String factoryNumber;

    private String factoryCatalog;

    private Boolean uploadForbiden;

    private String sourceUrl;

    private String comments;

    private Float cost;

    private Float shippingCost;

    private String customCode;

    private String engDesc;

    private String declarePrice;

    private String chDesc;

    private String innerSku;

    private Boolean suitForGroup;

    private String productMaterial;

    private String packetMaterial;

    private String metalType;

    private String jewelType;

    private String packageGrossWeight;

    private Boolean hasBattery;

    private Float packageLong;

    private Float packageWidth;

    private Float packageHight;

    private Long inStore;

    private Long countPerPackage;

    private Integer productTypeId;

    private Integer userId;

    private List<ProductPicture> productPictures;
    private ProductType productType;

    private  List<ProductDetail> productDetails;

    public List<ProductPicture> getProductPictures() {
        return productPictures;
    }

    public List<ProductDetail> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<ProductDetail> productDetails) {
        this.productDetails = productDetails;
    }

    public void setProductPictures(List<ProductPicture> productPictures) {
        this.productPictures = productPictures;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Boolean getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Boolean auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Boolean getOnsale() {
        return onsale;
    }

    public void setOnsale(Boolean onsale) {
        this.onsale = onsale;
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
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

    public Boolean getUploadForbiden() {
        return uploadForbiden;
    }

    public void setUploadForbiden(Boolean uploadForbiden) {
        this.uploadForbiden = uploadForbiden;
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

    public Boolean getSuitForGroup() {
        return suitForGroup;
    }

    public void setSuitForGroup(Boolean suitForGroup) {
        this.suitForGroup = suitForGroup;
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

    public Boolean getHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(Boolean hasBattery) {
        this.hasBattery = hasBattery;
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

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }
}