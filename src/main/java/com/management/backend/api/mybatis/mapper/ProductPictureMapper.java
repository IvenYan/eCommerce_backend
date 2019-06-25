package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductPicture;
import com.management.backend.api.mybatis.model.ProductPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductPictureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int countByExample(ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int deleteByExample(ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int insert(ProductPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int insertSelective(ProductPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    List<ProductPicture> selectByExampleWithBLOBs(ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    List<ProductPicture> selectByExample(ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    ProductPicture selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByExample(@Param("record") ProductPicture record, @Param("example") ProductPictureExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByPrimaryKeySelective(ProductPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(ProductPicture record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_picture
     *
     * @mbggenerated Mon Jun 24 21:47:09 CST 2019
     */
    int updateByPrimaryKey(ProductPicture record);
}