package com.fanfan.hr.common;

import com.fanfan.hr.pojo.Employee;

import java.util.List;

public class EmpInfoDTO {

    private int totalCount;

    private List<Employee> employeeList;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
