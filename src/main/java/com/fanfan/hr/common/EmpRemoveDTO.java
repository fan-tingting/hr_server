package com.fanfan.hr.common;

import com.fanfan.hr.pojo.EmployeeRemove;

public class EmpRemoveDTO extends EmployeeRemove {

    private String departmentName;

    private String positionName;

    private String employeeName;

    private String afterDepartmentName;

    private String afterJobName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getAfterDepartmentName() {
        return afterDepartmentName;
    }

    public void setAfterDepartmentName(String afterDepartmentName) {
        this.afterDepartmentName = afterDepartmentName;
    }

    public String getAfterJobName() {
        return afterJobName;
    }

    public void setAfterJobName(String afterJobName) {
        this.afterJobName = afterJobName;
    }
}
