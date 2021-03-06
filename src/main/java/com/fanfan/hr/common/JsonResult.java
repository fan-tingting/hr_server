package com.fanfan.hr.common;

public class JsonResult<T> {

    private T data;

    private String message;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonResult<T> ok(T data,String message) {
        this.data = data;
        this.message = message;
        return this;
    }
}
