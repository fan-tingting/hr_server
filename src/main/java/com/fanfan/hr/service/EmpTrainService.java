package com.fanfan.hr.service;

import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.pojo.EmployeeTrain;

public interface EmpTrainService {

    JsonResult getEmpTrainList(IdPageInputDTO pageInputDTO);

    JsonResult addEmpTrain(EmployeeTrain employeeTrain);

    JsonResult updateEmpTrain(EmployeeTrain employeeTrain);

    JsonResult deleteEmpTrain(EmployeeTrain employeeTrain);
}
