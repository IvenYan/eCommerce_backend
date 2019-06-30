package com.management.backend.api.mybatis.model;

import java.util.List;

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
    private int  audit_status;
    private int onsale;
    private int level;
    private List<String> pictureList;

    public int getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(int audit_status) {
        this.audit_status = audit_status;
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

    public List<String> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<String> pictureList) {
        this.pictureList = pictureList;
    }

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
