package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.ProductItem;
import com.management.backend.api.mybatis.model.ProductItemType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName ProductItemMapper
 * @Author Iven
 * @Date 2019/6/29 13:04
 * @Version 1.0
 * @Description TODO
 */
@Mapper
@Component
public interface ProductItemTypeMapper {

    List<ProductItemType> selectByPid(int pid);
    int insert(ProductItemType ProductItemType);
    int update(ProductItemType ProductItemType);
    int deleteByPid(int pid);
}
