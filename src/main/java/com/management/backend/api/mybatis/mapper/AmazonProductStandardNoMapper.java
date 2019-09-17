package com.management.backend.api.mybatis.mapper;

import com.github.pagehelper.ISelect;
import com.management.backend.api.mybatis.model.AmazonProductStandardNo;
import com.management.backend.api.mybatis.model.AmazonProductStandardNoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonProductStandardNoMapper extends ISelect {

//    查询 最新的 UPC 编码
    AmazonProductStandardNo getNewNotUsedNo();
//    查询出所有的 UPC 编码
    List<AmazonProductStandardNo> listAmazonStandardNo();

    int countByExample(AmazonProductStandardNoExample example);

    int deleteByExample(AmazonProductStandardNoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonProductStandardNo record);

    int insertSelective(AmazonProductStandardNo record);

    List<AmazonProductStandardNo> selectByExample(AmazonProductStandardNoExample example);

    AmazonProductStandardNo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonProductStandardNo record, @Param("example") AmazonProductStandardNoExample example);

    int updateByExample(@Param("record") AmazonProductStandardNo record, @Param("example") AmazonProductStandardNoExample example);

    int updateByPrimaryKeySelective(AmazonProductStandardNo record);

    int updateByPrimaryKey(AmazonProductStandardNo record);
}
