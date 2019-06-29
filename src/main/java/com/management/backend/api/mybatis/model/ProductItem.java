package com.management.backend.api.mybatis.model;

import java.util.List;

/**
 * @ClassName ProductItem
 * @Author Iven
 * @Date 2019/6/29 11:04
 * @Version 1.0
 * @Description TODO
 */
public class ProductItem {

    private int id;
//    所属的具体产品id
    private int pid;
//传入的图片数组值
    private List<String> pictureList;
//    图片数组
    private String     pictureListString;
//    变体名称，Example  Pink,Brown
    private String name;
//    SKU id
    private String skuId;
//    库存
    private int inventory;
//    加价
    private double addPrice;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<String> getPictureList() {
        return pictureList;
    }

    public void setPictureList(List<String> pictureList) {
        this.pictureList = pictureList;
    }

    public String getPictureListString() {
        return pictureListString;
    }

    public void setPictureListString(String pictureListString) {
        this.pictureListString = pictureListString;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(double addPrice) {
        this.addPrice = addPrice;
    }
}
