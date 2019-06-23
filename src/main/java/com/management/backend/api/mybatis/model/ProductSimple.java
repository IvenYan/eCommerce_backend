package com.management.backend.api.mybatis.model;

/**
 * @ClassName ProductSimple
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/22 23:31
 * @Version 1.0
 **/
public class ProductSimple {

    private int id;
    private float cost;    // 成本单价
    private float shippingCost;    //运费
    private String productTitle;    // 产品简介
    private String picture;     //产品图片

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(float shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
