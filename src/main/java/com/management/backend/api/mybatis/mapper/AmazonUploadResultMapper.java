package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonUploadResult;
import com.management.backend.api.mybatis.model.AmazonUploadResultExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonUploadResultMapper {
    List<AmazonUploadResult> selectAll();
    int countAll();

    int countByExample(AmazonUploadResultExample example);

    int deleteByExample(AmazonUploadResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonUploadResult record);

    int insertSelective(AmazonUploadResult record);

    List<AmazonUploadResult> selectByExample(AmazonUploadResultExample example);

    AmazonUploadResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonUploadResult record, @Param("example") AmazonUploadResultExample example);

    int updateByExample(@Param("record") AmazonUploadResult record, @Param("example") AmazonUploadResultExample example);

    int updateByPrimaryKeySelective(AmazonUploadResult record);

    int updateByPrimaryKey(AmazonUploadResult record);
}
