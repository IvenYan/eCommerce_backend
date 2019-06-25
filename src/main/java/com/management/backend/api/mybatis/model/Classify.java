package com.management.backend.api.mybatis.model;

import java.util.List;

/**
 * @ClassName Classify
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/23 17:57
 * @Version 1.0
 **/
public class Classify {
    private int value;
    private String label;
    private int pid;
    private List children;

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
