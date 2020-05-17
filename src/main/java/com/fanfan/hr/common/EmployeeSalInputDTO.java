package com.fanfan.hr.common;

import com.fanfan.hr.pojo.EmployeeSal;

public class EmployeeSalInputDTO extends EmployeeSal {
    //套餐id
    private Integer salaryId;

    public Integer getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Integer salaryId) {
        this.salaryId = salaryId;
    }
}
