package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpRemoveInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.EmployeeRemove;

public interface EmpRemoveService {

    JsonResult removeEmp(EmployeeRemove employeeRemove);

}
