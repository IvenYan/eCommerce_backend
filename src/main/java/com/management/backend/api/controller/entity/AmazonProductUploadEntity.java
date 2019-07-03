package com.management.backend.api.controller.entity;

/**
 * @ClassName AmazonProductUploadEntity
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/7/1 21:26
 * @Version 1.0
 **/
public class AmazonProductUploadEntity {

    private int productId;
    private int amazonAccountId;
    private int processDays;
    private String amazonProductType;
    private String factoryName;
    private String factoryNo;
    private String productType;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAmazonAccountId() {
        return amazonAccountId;
    }

    public void setAmazonAccountId(int amazonAccountId) {
        this.amazonAccountId = amazonAccountId;
    }

    public int getProcessDays() {
        return processDays;
    }

    public void setProcessDays(int processDays) {
        this.processDays = processDays;
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
}
