package com.management.backend.api.controller.entity;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName RequestSearchProduct
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/6/30 14:19
 * @Version 1.0
 **/
public class RequestSearchProduct {
    private String valuecascader;
    private String marray;
    private String valued;
    private String inputbh;
    private String inputOther;
    private int audit_status;
    private int onsale;
    private int level;
    private int pageNum;
    private int pageSize;

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

    @Override
    public String toString() {
        return "RequestSearchProduct{" +
                "valuecascader=" + valuecascader +
                ", marray=" + marray +
                ", valued='" + valued + '\'' +
                ", inputbh='" + inputbh + '\'' +
                ", inputOther='" + inputOther + '\'' +
                ", audit_status=" + audit_status +
                ", onsale=" + onsale +
                ", level=" + level +
                '}';
    }

    public String getValuecascader() {
        return valuecascader;
    }

    public void setValuecascader(String valuecascader) {
        this.valuecascader = valuecascader;
    }

    public String getMarray() {
        return marray;
    }

    public void setMarray(String marray) {
        this.marray = marray;
    }

    public String getValued() {
        return valued;
    }

    public void setValued(String valued) {
        this.valued = valued;
    }

    public String getInputbh() {
        return inputbh;
    }

    public void setInputbh(String inputbh) {
        this.inputbh = inputbh;
    }

    public String getInputOther() {
        return inputOther;
    }

    public void setInputOther(String inputOther) {
        this.inputOther = inputOther;
    }

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
}
