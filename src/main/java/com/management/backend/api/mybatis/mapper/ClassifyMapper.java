package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.mybatis.model.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName ClassifyMapper
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 17:51
 * @Version 1.0
 **/
@Mapper
@Component
public interface ClassifyMapper {

    List<Classify> selectByPid(int pid);
//    未用
//    List<Classify> selectClassifyByPid(int pid);

}
