package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.AmazonProductClassify;
import com.management.backend.api.mybatis.model.AmazonProductClassifyExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface AmazonProductClassifyMapper {
    int countByExample(AmazonProductClassifyExample example);

    int deleteByExample(AmazonProductClassifyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AmazonProductClassify record);

    int insertSelective(AmazonProductClassify record);

    List<AmazonProductClassify> selectByExample(AmazonProductClassifyExample example);

    AmazonProductClassify selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AmazonProductClassify record, @Param("example") AmazonProductClassifyExample example);

    int updateByExample(@Param("record") AmazonProductClassify record, @Param("example") AmazonProductClassifyExample example);

    int updateByPrimaryKeySelective(AmazonProductClassify record);

    int updateByPrimaryKey(AmazonProductClassify record);

    int updatePid(@Param("sourceId") int sourceId,@Param("pid") int pid);
    int updatePidAndChineseName(@Param("sourceId") int sourceId,@Param("pid") int pid,@Param("chineseName") String chineseName);
    int updatePidAndNodeType(@Param("sourceId") int sourceId,@Param("pid") int pid,@Param("nodeType") String nodeType,@Param("chineseName") String chineseName);
    AmazonProductClassify selectByNodePath(@Param("nodePath") String nodePath);
    AmazonProductClassify selectByNodeType(@Param("nodeType") String nodeType);
}
