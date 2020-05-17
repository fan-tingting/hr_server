package com.fanfan.hr.service;

import com.fanfan.hr.common.EmployeeSalInputDTO;
import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;

public interface EmpSalService {

    JsonResult getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO);

    JsonResult updateEmpSal(EmployeeSalInputDTO inputDTO);

    JsonResult showEmpSalary(EmpinfoInputDTO empinfoInputDTO);
}
