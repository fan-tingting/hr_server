package com.fanfan.hr.pojo;

import com.fanfan.hr.common.util.StringUtil;
import com.mysql.cj.util.StringUtils;

import java.util.Date;

public class EmployeeTrain {
    private Integer id;

    private Integer eid;

    private Date traindate;

    private String traincontent;

    private String remark;

    private String name;

    private String traindateStr;

    public EmployeeTrain(Integer id, Integer eid, Date traindate, String traincontent, String remark) {
        this.id = id;
        this.eid = eid;
        this.traindate = traindate;
        this.traincontent = traincontent;
        this.remark = remark;
    }

    public EmployeeTrain() {
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

    public Date getTraindate() {
        return traindate;
    }

    public void setTraindate(Date traindate) {
        this.traindate = traindate;
    }

    public String getTraincontent() {
        return traincontent;
    }

    public void setTraincontent(String traincontent) {
        this.traincontent = traincontent == null ? null : traincontent.trim();
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

    public String getTraindateStr() {
        return traindateStr;
    }

    public void setTraindateStr(String traindateStr) {
        this.traindateStr = traindateStr;
        this.traindate = StringUtil.getDateFromStr(traindateStr);
    }
}