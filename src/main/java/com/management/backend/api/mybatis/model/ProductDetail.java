package com.management.backend.api.mybatis.model;

public class ProductDetail {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.title
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.key_words
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private String keyWords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.keypoint_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private String keypointDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.product_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private String productDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.language_type
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private Byte languageType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_detail.product_id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    private Integer productId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.id
     *
     * @return the value of product_detail.id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.id
     *
     * @param id the value for product_detail.id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.title
     *
     * @return the value of product_detail.title
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.title
     *
     * @param title the value for product_detail.title
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.key_words
     *
     * @return the value of product_detail.key_words
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public String getKeyWords() {
        return keyWords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.key_words
     *
     * @param keyWords the value for product_detail.key_words
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords == null ? null : keyWords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.keypoint_desc
     *
     * @return the value of product_detail.keypoint_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public String getKeypointDesc() {
        return keypointDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.keypoint_desc
     *
     * @param keypointDesc the value for product_detail.keypoint_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setKeypointDesc(String keypointDesc) {
        this.keypointDesc = keypointDesc == null ? null : keypointDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.product_desc
     *
     * @return the value of product_detail.product_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.product_desc
     *
     * @param productDesc the value for product_detail.product_desc
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.language_type
     *
     * @return the value of product_detail.language_type
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public Byte getLanguageType() {
        return languageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.language_type
     *
     * @param languageType the value for product_detail.language_type
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setLanguageType(Byte languageType) {
        this.languageType = languageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_detail.product_id
     *
     * @return the value of product_detail.product_id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_detail.product_id
     *
     * @param productId the value for product_detail.product_id
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}