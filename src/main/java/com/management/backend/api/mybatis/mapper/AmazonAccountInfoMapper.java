package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonAccountInfo;
import com.management.backend.api.mybatis.model.AmazonAccountInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonAccountInfoMapper {
//Demo 验证接口不可以是无初始化的变量
    //    int a;

   /* int insert(AmazonAccountInfo record);

    int insertSelective(AmazonAccountInfo record);

    List<AmazonAccountInfo> selectByExample(AmazonAccountInfoExample example);*/

    List<AmazonAccountInfo> selectList();
    AmazonAccountInfo selectByPrimaryKey(Integer id);

    AmazonAccountInfo selectByAccountName(String amazonAccountName);

    /*int updateByExampleSelective(@Param("record") AmazonAccountInfo record, @Param("example") AmazonAccountInfoExample example);

    int updateByExample(@Param("record") AmazonAccountInfo record, @Param("example") AmazonAccountInfoExample example);

    int updateByPrimaryKeySelective(AmazonAccountInfo record);

    int updateByPrimaryKey(AmazonAccountInfo record);*/
}
