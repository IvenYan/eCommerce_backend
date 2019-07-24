package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonClassify;
import com.management.backend.api.mybatis.model.AmazonClassifyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonClassifyMapper {
    int countByExample(AmazonClassifyExample example);

    int deleteByExample(AmazonClassifyExample example);



    int deleteByPrimaryKey(Integer id);

    int insert(AmazonClassify record);

    int insertSelective(AmazonClassify record);

    List<AmazonClassify> selectByExample(AmazonClassifyExample example);

    AmazonClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonClassify record, @Param("example") AmazonClassifyExample example);

    int updateByExample(@Param("record") AmazonClassify record, @Param("example") AmazonClassifyExample example);

    int updateByPrimaryKeySelective(AmazonClassify record);

    int updateByPrimaryKey(AmazonClassify record);
//    获取父节点的所有值
List<AmazonClassify> selectByPid(@Param("pid")Integer pid);
    List<AmazonClassify> selectAmazonProductClassifyV2ByPid(@Param("pid")Integer pid);

    List<AmazonClassify> selectBySearchName(@Param("searchName")String searchName);

}
