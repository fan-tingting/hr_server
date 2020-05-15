package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.EmployeeEc;

public interface EmpEcService {

    JsonResult getEcList(EmpinfoInputDTO empinfoInputDTO);

    JsonResult addEmpEc(EmployeeEc employeeEc);

    JsonResult updateEmpEc(EmployeeEc employeeEc);

    JsonResult deleteEmpEc(Integer id);
}
