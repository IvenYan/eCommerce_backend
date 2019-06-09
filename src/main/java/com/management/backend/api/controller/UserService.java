package com.management.backend.api.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.management.backend.api.mybatis.mapper.UserMapper;
import com.management.backend.api.mybatis.model.User;
import com.management.backend.api.mybatis.model.UserExample;
import com.management.backend.api.util.Resp;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value = "user operations",tags = {"user service"})
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @ApiOperation(value="获取用户详细信息", notes="根据用户的id来获取用户详细信息",produces="application/json",consumes = "application/json")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true,paramType = "path", dataType = "Integer")
    @GetMapping(value = "/users/{userId}")
    public User getUser(@PathVariable("userId") int userId){
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @ApiOperation(value="获取用户列表信息", notes="获取所有用户的详细信息",produces="application/json",consumes = "application/json")
    @GetMapping(value = "/users")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "获取的页码", required = true,paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "每页数据条数", required = true,paramType = "query", dataType = "int")
    })
    public PageInfo<User> getUsers(@RequestParam("pageNum") int pageNum, @RequestParam("pageSize") int pageSize){
        PageHelper.startPage(pageNum, pageSize);

        ArrayList<User> users = (ArrayList<User>) userMapper.selectByExample(new UserExample());
        PageInfo<User> appsPageInfo = new PageInfo<User>(users);
        return appsPageInfo;
    }

    @ApiOperation(value="创建用户", notes="创建一个新的用户",produces="application/json",consumes = "application/json")
    @PostMapping(value = "/user")
    public Resp saveUser(@RequestBody @ApiParam(name="用户对象",value="传入json格式;id字段会自动生成",required=true) User user){
           userMapper.insert(user);
        return new Resp(user.getId());
    }

    @ApiOperation(value="更新用户", notes="更新一个已存在的用户",produces="application/json",consumes = "application/json")
    @PutMapping(value = "/users/{userId}")
    @ApiImplicitParam(name = "userId", value = "用户ID", required = true,paramType = "path", dataType = "Integer")
    public int updateUser(@RequestBody @ApiParam(name="用户对象",value="传入json格式;可以忽略id字段",required=true) User user,@PathVariable("userId") int userId){
        UserExample ue = new UserExample();
        ue.createCriteria().andIdEqualTo(userId);
        user.setId(userId);
        return   userMapper.updateByExample(user,ue);
    }

    @ApiOperation(value="验证用户", notes="根据用户名、密码判断该用户是否存在",produces="application/json",consumes = "application/json")
    @GetMapping(value = "user")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "loginName", value = "用户名", required = true,paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "loginPasswd", value = "用户密码", required = true,paramType = "query", dataType = "String")
    })
    public  List<User>  checkUser(@RequestParam("loginName") String loginName,@RequestParam("loginPasswd") String loginPasswd){
        UserExample ue = new UserExample();
        ue.createCriteria().andLoginNameEqualTo(loginName).andLoginPasswdEqualTo(loginPasswd);
        return   userMapper.selectByExample(ue);
    }

}
