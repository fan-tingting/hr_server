package com.fanfan.hr.pojo;

import java.util.Date;

public class MsgContent {
    private Integer id;

    private String title;

    private String message;

    private Date createdate;

    public MsgContent(Integer id, String title, String message, Date createdate) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createdate = createdate;
    }

    public MsgContent() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}