package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductSimple;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("ProductSimpleMapper")
public interface ProductSimpleMapper {
    List<ProductSimple> getSimpleProduct();
    int countProduct();
}