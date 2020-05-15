package com.fanfan.hr.common;

import com.fanfan.hr.pojo.EmployeeEc;

import java.util.List;

public class EmpEcResultDTO {

    private Integer totalCount;

    private List<EmployeeEc> employeeEcList;

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public List<EmployeeEc> getEmployeeEcList() {
        return employeeEcList;
    }

    public void setEmployeeEcList(List<EmployeeEc> employeeEcList) {
        this.employeeEcList = employeeEcList;
    }
}
