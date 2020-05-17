package com.fanfan.hr.common;

import com.fanfan.hr.pojo.EmployeeRemove;

public class EmpRemoveInputDTO extends EmployeeRemove {
    //员工Id
    private Integer eid;
    //部门Id
    private Integer departmentId;
    //职位Id
    private Integer positionId;

    private String reason;

    private String remark;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
