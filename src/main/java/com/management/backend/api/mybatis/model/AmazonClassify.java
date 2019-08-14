package com.management.backend.api.mybatis.model;

import java.util.List;

public class AmazonClassify {
    private List<AmazonClassify> children;
    private Integer id;

    //中文名称
    private String value;

    private Integer pid;
//分类名称
    private String label;
//    数组形式的
    private List<String> labelList;
    private String amazontype;
//分类节点ID
    private String nodeid;
//   类似于Baby(宝宝)
    private String fullName;

//    是否有子类
    private String hasChildren;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getLabelList() {
        return labelList;
    }

    public void setLabelList(List<String> labelList) {
        this.labelList = labelList;
    }

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

    public String getHasChildren() {
        return hasChildren;
    }

    public void setHasChildren(String hasChildren) {
        this.hasChildren = hasChildren;
    }
}
