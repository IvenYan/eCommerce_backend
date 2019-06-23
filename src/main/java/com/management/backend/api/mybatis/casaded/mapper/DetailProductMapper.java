package com.management.backend.api.mybatis.casaded.mapper;

import com.management.backend.api.mybatis.casaded.model.DetailProduct;
import com.management.backend.api.mybatis.model.ProductExample;

import java.util.List;

public interface DetailProductMapper {

    List<DetailProduct> selectByExample(ProductExample example);

    DetailProduct selectByPrimaryKey(Integer id);

}