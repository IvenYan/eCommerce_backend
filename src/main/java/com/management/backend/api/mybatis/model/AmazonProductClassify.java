package com.management.backend.api.mybatis.model;

public class AmazonProductClassify {
    private Integer id;

    private String nodeid;

    private String nodepath;

    private Integer pid;

    private String nodetype;

    private String chineseName;

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNodeid() {
        return nodeid;
    }

    public void setNodeid(String nodeid) {
        this.nodeid = nodeid == null ? null : nodeid.trim();
    }

    public String getNodepath() {
        return nodepath;
    }

    public void setNodepath(String nodepath) {
        this.nodepath = nodepath == null ? null : nodepath.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getNodetype() {
        return nodetype;
    }

    public void setNodetype(String nodetype) {
        this.nodetype = nodetype == null ? null : nodetype.trim();
    }
}
