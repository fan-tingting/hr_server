package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;

public interface EmpEcService {

    JsonResult getEcList(EmpinfoInputDTO empinfoInputDTO);

}
