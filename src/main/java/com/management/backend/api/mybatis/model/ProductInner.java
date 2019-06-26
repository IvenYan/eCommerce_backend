package com.management.backend.api.mybatis.model;

import java.util.List;

/**
 * @ClassName ProductInner
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/25 21:05
 * @Version 1.0
 **/
public class ProductInner {
//    变体种类，尺寸，或者颜色
    private String typeName;
    private String name;        //名称
    private String SKU;         //SKU
    private String inventory;   //库存
    private String extraPrice;  //加价
    private List<String> pictureNames;   //图片名称

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getExtraPrice() {
        return extraPrice;
    }

    public void setExtraPrice(String extraPrice) {
        this.extraPrice = extraPrice;
    }

    public List<String> getPictureNames() {
        return pictureNames;
    }

    public void setPictureNames(List<String> pictureNames) {
        this.pictureNames = pictureNames;
    }
}
