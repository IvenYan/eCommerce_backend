package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonUploadHistory;
import com.management.backend.api.mybatis.model.AmazonUploadHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AmazonUploadHistoryMapper {
    int countByExample(AmazonUploadHistoryExample example);

    int deleteByExample(AmazonUploadHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonUploadHistory record);

    int insertSelective(AmazonUploadHistory record);

    List<AmazonUploadHistory> selectByExample(AmazonUploadHistoryExample example);

    AmazonUploadHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonUploadHistory record, @Param("example") AmazonUploadHistoryExample example);

    int updateByExample(@Param("record") AmazonUploadHistory record, @Param("example") AmazonUploadHistoryExample example);

    int updateByPrimaryKeySelective(AmazonUploadHistory record);

    int updateByPrimaryKey(AmazonUploadHistory record);

}
