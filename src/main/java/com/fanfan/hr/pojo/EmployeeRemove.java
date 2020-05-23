package com.fanfan.hr.pojo;

import com.fanfan.hr.common.util.StringUtil;

import java.util.Date;

public class EmployeeRemove {
    private Integer id;

    private Integer eid;

    private Integer afterdepartment;

    private Integer afterjob;

    private Date removedate;

    private String removeDateStr;

    private String reason;

    private String remark;

    public EmployeeRemove(Integer id, Integer eid, Integer afterdepartment, Integer afterjob, Date removedate, String reason, String remark) {
        this.id = id;
        this.eid = eid;
        this.afterdepartment = afterdepartment;
        this.afterjob = afterjob;
        this.removedate = removedate;
        this.reason = reason;
        this.remark = remark;
    }

    public EmployeeRemove() {
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

    public Integer getAfterdepartment() {
        return afterdepartment;
    }

    public void setAfterdepartment(Integer afterdepartment) {
        this.afterdepartment = afterdepartment;
    }

    public Integer getAfterjob() {
        return afterjob;
    }

    public void setAfterjob(Integer afterjob) {
        this.afterjob = afterjob;
    }

    public Date getRemovedate() {
        return removedate;
    }

    public void setRemovedate(Date removedate) {
        this.removedate = removedate;
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

    public String getRemoveDateStr() {
        return removeDateStr;
    }

    public void setRemoveDateStr(String removeDateStr) {
        this.removeDateStr = removeDateStr;
        if(this.removedate == null) {
            this.removedate = StringUtil.getDateFromStr(removeDateStr);
        }
    }
}