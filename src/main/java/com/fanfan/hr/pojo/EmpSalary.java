package com.fanfan.hr.pojo;

public class EmpSalary {
    private Integer id;

    private Integer eid;

    private Integer sid;

    public EmpSalary(Integer id, Integer eid, Integer sid) {
        this.id = id;
        this.eid = eid;
        this.sid = sid;
    }

    public EmpSalary() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}