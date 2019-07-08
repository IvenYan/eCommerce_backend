package com.management.backend.api.mybatis.model;

public class AmazonUploadHistory {
    private Integer id;

    private Integer amazonaccountid;

    private String processdays;

    private String producttype;

    private String amazonproducttype;

    private String factoryname;

    private String factoryno;

    private String productbrand;

    private String titleprefix;

    private String titlesuffix;

    private String keywords;

    private String descprefix;

    private String descsuffix;

    private String desctag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmazonaccountid() {
        return amazonaccountid;
    }

    public void setAmazonaccountid(Integer amazonaccountid) {
        this.amazonaccountid = amazonaccountid;
    }

    public String getProcessdays() {
        return processdays;
    }

    public void setProcessdays(String processdays) {
        this.processdays = processdays == null ? null : processdays.trim();
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype == null ? null : producttype.trim();
    }

    public String getAmazonproducttype() {
        return amazonproducttype;
    }

    public void setAmazonproducttype(String amazonproducttype) {
        this.amazonproducttype = amazonproducttype == null ? null : amazonproducttype.trim();
    }

    public String getFactoryname() {
        return factoryname;
    }

    public void setFactoryname(String factoryname) {
        this.factoryname = factoryname == null ? null : factoryname.trim();
    }

    public String getFactoryno() {
        return factoryno;
    }

    public void setFactoryno(String factoryno) {
        this.factoryno = factoryno == null ? null : factoryno.trim();
    }

    public String getProductbrand() {
        return productbrand;
    }

    public void setProductbrand(String productbrand) {
        this.productbrand = productbrand == null ? null : productbrand.trim();
    }

    public String getTitleprefix() {
        return titleprefix;
    }

    public void setTitleprefix(String titleprefix) {
        this.titleprefix = titleprefix == null ? null : titleprefix.trim();
    }

    public String getTitlesuffix() {
        return titlesuffix;
    }

    public void setTitlesuffix(String titlesuffix) {
        this.titlesuffix = titlesuffix == null ? null : titlesuffix.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getDescprefix() {
        return descprefix;
    }

    public void setDescprefix(String descprefix) {
        this.descprefix = descprefix == null ? null : descprefix.trim();
    }

    public String getDescsuffix() {
        return descsuffix;
    }

    public void setDescsuffix(String descsuffix) {
        this.descsuffix = descsuffix == null ? null : descsuffix.trim();
    }

    public String getDesctag() {
        return desctag;
    }

    public void setDesctag(String desctag) {
        this.desctag = desctag == null ? null : desctag.trim();
    }
}