package com.management.backend.api.mybatis.model;

import java.util.Date;

public class AmazonUploadResult {
    private Integer id;

    private Integer batchno;

    private String amazonaccount;

    private Integer accountid;

    private String uploadtype;

    private String uploadtypedesc;

    private String uploadproductcounts;

    private Date createdate;

    private Integer uploaderror;

    private Integer uploadwarn;

    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchno() {
        return batchno;
    }

    public void setBatchno(Integer batchno) {
        this.batchno = batchno;
    }

    public String getAmazonaccount() {
        return amazonaccount;
    }

    public void setAmazonaccount(String amazonaccount) {
        this.amazonaccount = amazonaccount == null ? null : amazonaccount.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getUploadtype() {
        return uploadtype;
    }

    public void setUploadtype(String uploadtype) {
        this.uploadtype = uploadtype == null ? null : uploadtype.trim();
    }

    public String getUploadtypedesc() {
        return uploadtypedesc;
    }

    public void setUploadtypedesc(String uploadtypedesc) {
        this.uploadtypedesc = uploadtypedesc == null ? null : uploadtypedesc.trim();
    }

    public String getUploadproductcounts() {
        return uploadproductcounts;
    }

    public void setUploadproductcounts(String uploadproductcounts) {
        this.uploadproductcounts = uploadproductcounts == null ? null : uploadproductcounts.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUploaderror() {
        return uploaderror;
    }

    public void setUploaderror(Integer uploaderror) {
        this.uploaderror = uploaderror;
    }

    public Integer getUploadwarn() {
        return uploadwarn;
    }

    public void setUploadwarn(Integer uploadwarn) {
        this.uploadwarn = uploadwarn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}