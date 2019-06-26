package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductSimple;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ProductSimpleMapper")
public interface ProductSimpleMapper {
//    列出最近一天的产品id
    List<Integer> listRecentlyProducts(@Param("curDateStr") String curDateStr);

    List<ProductSimple> getSimpleProduct();
    int countProduct();
}