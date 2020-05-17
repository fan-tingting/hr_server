package com.fanfan.hr.pojo;

import com.fanfan.hr.common.util.StringUtil;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EmployeeEc {
    private Integer id;

    private Integer eid;

    private String name;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date ecdate;
    //前端传递的ecdate参数写入到ecdateStr中。ecdate前端不赋值
    private String ecdateStr;

    private String ecreason;

    private Integer ecpoint;

    private Integer ectype;

    private String remark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeEc(Integer id, Integer eid, Date ecdate, String ecreason, Integer ecpoint, Integer ectype, String remark) {
        this.id = id;
        this.eid = eid;
        this.ecdate = ecdate;
        this.ecreason = ecreason;
        this.ecpoint = ecpoint;
        this.ectype = ectype;
        this.remark = remark;
    }

    public EmployeeEc() {
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

    public Date getEcdate() {
        return ecdate;
    }

    public void setEcdate(Date ecdate) {
        this.ecdate = ecdate;
    }

    public String getEcreason() {
        return ecreason;
    }

    public void setEcreason(String ecreason) {
        this.ecreason = ecreason == null ? null : ecreason.trim();
    }

    public Integer getEcpoint() {
        return ecpoint;
    }

    public void setEcpoint(Integer ecpoint) {
        this.ecpoint = ecpoint;
    }

    public Integer getEctype() {
        return ectype;
    }

    public void setEctype(Integer ectype) {
        this.ectype = ectype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getEcdateStr() {
        return ecdateStr;
    }

    public void setEcdateStr(String ecdateStr) {
        this.ecdateStr = ecdateStr;
        //如果ecdateStr传一个null 会出问题，判断是否为null
        this.ecdate = StringUtil.getDateFromStr(ecdateStr);
    }
}
