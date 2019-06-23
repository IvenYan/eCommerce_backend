package com.management.backend.api.mybatis.model;

/**
 * @ClassName Classify
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 17:57
 * @Version 1.0
 **/
public class Classify {
    private int id;
    private String name;
    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
