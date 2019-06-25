package com.management.backend.api.mybatis.mapper;

import com.management.backend.api.controller.entity.UserSimple;

import java.util.List;

/**
 * @ClassName UserSimpleMapper
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/24 20:27
 * @Version 1.0
 **/
public interface UserSimpleMapper {
    List<UserSimple>  selectAllUserSimple();
}
