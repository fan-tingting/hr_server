package com.fanfan.hr.pojo;

import java.util.Date;

public class SalaryKey {
    private Integer id;

    private Date createdate;

    public SalaryKey(Integer id, Date createdate) {
        this.id = id;
        this.createdate = createdate;
    }

    public SalaryKey() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}