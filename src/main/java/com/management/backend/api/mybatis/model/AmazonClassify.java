package com.management.backend.api.mybatis.model;

import java.util.List;

public class AmazonClassify {
    private List<AmazonClassify> children;
    private Integer id;

    private String value;

    private Integer pid;

    private String label;

    private String amazontype;

    private String nodeid;

    private String haschild;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<AmazonClassify> getChildren() {
        return children;
    }

    public void setChildren(List<AmazonClassify> children) {
        this.children = children;
    }

    public String getAmazontype() {
        return amazontype;
    }

    public void setAmazontype(String amazontype) {
        this.amazontype = amazontype == null ? null : amazontype.trim();
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getHaschild() {
        return haschild;
    }

    public void setHaschild(String haschild) {
        this.haschild = haschild == null ? null : haschild.trim();
    }
}
