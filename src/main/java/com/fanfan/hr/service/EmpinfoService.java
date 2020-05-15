package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.EmployeeDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.Employee;

public interface EmpinfoService {

    JsonResult getEmpinfo(EmpinfoInputDTO inputDTO);

    JsonResult addEmp(EmployeeDTO input);

    JsonResult editEmp(EmployeeDTO input);

    JsonResult deleteEmpInfo(Integer id);
}
