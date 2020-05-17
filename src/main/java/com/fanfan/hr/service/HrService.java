package com.fanfan.hr.service;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.HrInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.EmployeeEc;

public interface HrService {

    JsonResult getHrList(PageInputDTO pageInputDTO);

    JsonResult addHr(HrInputDTO hrInputDTO);

    JsonResult updateHr(HrInputDTO hrInputDTO);

    JsonResult deleteHr(HrInputDTO hrInputDTO);
}
