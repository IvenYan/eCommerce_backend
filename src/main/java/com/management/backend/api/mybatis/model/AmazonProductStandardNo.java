package com.management.backend.api.mybatis.model;

public class AmazonProductStandardNo {
    private Integer id;

    private String standardProductId;

    private String standardType;

    private String used;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStandardProductId() {
        return standardProductId;
    }

    public void setStandardProductId(String standardProductId) {
        this.standardProductId = standardProductId == null ? null : standardProductId.trim();
    }

    public String getStandardType() {
        return standardType;
    }

    public void setStandardType(String standardType) {
        this.standardType = standardType == null ? null : standardType.trim();
    }

    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used == null ? null : used.trim();
    }
}