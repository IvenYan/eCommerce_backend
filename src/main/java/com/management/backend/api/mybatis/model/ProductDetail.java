package com.management.backend.api.mybatis.model;

public class ProductDetail {
    private Integer id;

    private String title;

    private String keyWords;

    private String keypointDesc;

    private String productDesc;

    private Byte languageType;

    private Integer productId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    public String getKeypointDesc() {
        return keypointDesc;
    }

    public void setKeypointDesc(String keypointDesc) {
        this.keypointDesc = keypointDesc == null ? null : keypointDesc.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public Byte getLanguageType() {
        return languageType;
    }

    public void setLanguageType(Byte languageType) {
        this.languageType = languageType;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}