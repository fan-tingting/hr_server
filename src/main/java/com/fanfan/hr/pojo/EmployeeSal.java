package com.fanfan.hr.pojo;

import java.util.Date;

public class EmployeeSal {
    private Integer id;

    private Integer eid;

    private Date salarydate;

    private Integer beforesalary;

    private Integer aftersalary;

    private String reason;

    private String remark;

    private String name;

    public EmployeeSal(Integer id, Integer eid, Date salarydate, Integer beforesalary, Integer aftersalary, String reason, String remark) {
        this.id = id;
        this.eid = eid;
        this.salarydate = salarydate;
        this.beforesalary = beforesalary;
        this.aftersalary = aftersalary;
        this.reason = reason;
        this.remark = remark;
    }

    public EmployeeSal() {
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

    public Date getSalarydate() {
        return salarydate;
    }

    public void setSalarydate(Date salarydate) {
        this.salarydate = salarydate;
    }

    public Integer getBeforesalary() {
        return beforesalary;
    }

    public void setBeforesalary(Integer beforesalary) {
        this.beforesalary = beforesalary;
    }

    public Integer getAftersalary() {
        return aftersalary;
    }

    public void setAftersalary(Integer aftersalary) {
        this.aftersalary = aftersalary;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}