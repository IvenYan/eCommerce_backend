package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonUploadHistory;
import com.management.backend.api.mybatis.model.AmazonUploadHistoryExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonUploadHistoryMapper {
    int countByExample(AmazonUploadHistoryExample example);

    int deleteByExample(AmazonUploadHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonUploadHistory record);

    int insertSelective(AmazonUploadHistory record);

    List<AmazonUploadHistory> selectByExample(AmazonUploadHistoryExample example);
    List<AmazonUploadHistory> selectListByCounts(@Param("counts") int counts,@Param("amazonAccountId") int amazonAccountId);

    AmazonUploadHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonUploadHistory record, @Param("example") AmazonUploadHistoryExample example);

    int updateByExample(@Param("record") AmazonUploadHistory record, @Param("example") AmazonUploadHistoryExample example);

    int updateByPrimaryKeySelective(AmazonUploadHistory record);

    int updateByPrimaryKey(AmazonUploadHistory record);

}
