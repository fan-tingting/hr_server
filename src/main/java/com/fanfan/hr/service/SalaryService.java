package com.fanfan.hr.service;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Salary;

public interface SalaryService {

    JsonResult getSalaryList(PageInputDTO pageInputDTO);

    JsonResult addSalaryList(Salary salary);

    JsonResult updateSalary(Salary salary);

    JsonResult deleteSalary(Salary salary);
}
