package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.EmployeeDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.Employee;

public interface EmpinfoService {

    public JsonResult getEmpinfo(EmpinfoInputDTO inputDTO);

    public JsonResult addEmp(EmployeeDTO input);

    public JsonResult editEmp(EmployeeDTO input);

    JsonResult deleteEmpInfo(Integer id);
}
