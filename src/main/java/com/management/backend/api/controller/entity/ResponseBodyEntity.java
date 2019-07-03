package com.management.backend.api.controller.entity;

/**
 * @ClassName ResponseBody
 * @Description TODO
 * @Author IvenYan
 * @Date 2019/7/3 20:57
 * @Version 1.0
 **/
public class ResponseBodyEntity {
private int id;
private String status;
private String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
