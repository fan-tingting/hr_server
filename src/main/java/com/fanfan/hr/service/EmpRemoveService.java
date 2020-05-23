package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpRemoveInputDTO;
import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.EmployeeRemove;

public interface EmpRemoveService {

    JsonResult removeEmp(EmployeeRemove employeeRemove);

    JsonResult getEmpRemoveInfo(IdPageInputDTO pageInputDTO);

    JsonResult addEmpRemove(EmployeeRemove employeeRemove);

    JsonResult updateEmpRemove(EmployeeRemove employeeRemove);
}
