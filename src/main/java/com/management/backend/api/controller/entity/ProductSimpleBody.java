package com.management.backend.api.controller.entity;

import com.management.backend.api.mybatis.model.ProductSimple;

import java.util.List;

/**
 * @ClassName ProductSimpleBody
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/22 23:47
 * @Version 1.0
 **/
public class ProductSimpleBody {
    private int total;
    private List<ProductSimple> list;
    private int pageNum;
    private int pageSize;
    private int audit_status;
    private int onsale;
    private int level;

    public int getAudit_status() {
        return audit_status;
    }

    public void setAudit_status(int audit_status) {
        this.audit_status = audit_status;
    }

    public int getOnsale() {
        return onsale;
    }

    public void setOnsale(int onsale) {
        this.onsale = onsale;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ProductSimple> getList() {
        return list;
    }

    public void setList(List<ProductSimple> list) {
        this.list = list;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

}
