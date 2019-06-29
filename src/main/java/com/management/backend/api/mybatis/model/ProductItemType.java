package com.management.backend.api.mybatis.model;

/**
 * @ClassName ProductItemType
 * @Author Iven
 * @Date 2019/6/29 13:01
 * @Version 1.0
 * @Description 变体类型，颜色，尺寸
 */
public class ProductItemType {

    private int id;
    private String name;
    private String value;
    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
