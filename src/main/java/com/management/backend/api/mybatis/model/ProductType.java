package com.management.backend.api.mybatis.model;

public class ProductType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type.id
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type.name
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type.pid
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type.id
     *
     * @return the value of product_type.id
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type.id
     *
     * @param id the value for product_type.id
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type.name
     *
     * @return the value of product_type.name
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type.name
     *
     * @param name the value for product_type.name
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type.pid
     *
     * @return the value of product_type.pid
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type.pid
     *
     * @param pid the value for product_type.pid
     *
     * @mbggenerated Sun Jun 09 21:58:57 CST 2019
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }
}