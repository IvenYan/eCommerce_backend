package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductDetail;
import com.management.backend.api.mybatis.model.ProductDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int countByExample(ProductDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int deleteByExample(ProductDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int insert(ProductDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int insertSelective(ProductDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    List<ProductDetail> selectByExample(ProductDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    ProductDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int updateByExample(@Param("record") ProductDetail record, @Param("example") ProductDetailExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int updateByPrimaryKeySelective(ProductDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_detail
     *
     * @mbggenerated Sun Jun 23 18:06:33 CST 2019
     */
    int updateByPrimaryKey(ProductDetail record);
}