package com.fanfan.hr.service;

import com.fanfan.hr.EmployeeSalInputDTO;
import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.EmployeeSal;

public interface EmpSalService {

    JsonResult getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO);

    JsonResult updateEmpSal(EmployeeSalInputDTO inputDTO);
}
