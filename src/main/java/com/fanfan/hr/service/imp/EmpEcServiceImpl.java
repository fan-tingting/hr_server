package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.EmpEcResultDTO;
import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.mapper.EmployeeEcMapper;
import com.fanfan.hr.pojo.EmployeeEc;
import com.fanfan.hr.service.EmpEcService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpEcServiceImpl implements EmpEcService {

    @Autowired
    private EmployeeEcMapper employeeEcMapper;


    @Override
    public JsonResult getEcList(EmpinfoInputDTO empinfoInputDTO) {
        JsonResult jsonResult = new JsonResult();
        empinfoInputDTO.setBeginPage((empinfoInputDTO.getPage() - 1) * empinfoInputDTO.getPage());
        EmpEcResultDTO resultDTO = new EmpEcResultDTO();
        List<EmployeeEc> employeeEcList = employeeEcMapper.getEcList(empinfoInputDTO);
        resultDTO.setEmployeeEcList(employeeEcList);
        Integer totalCount = 0;
        if(employeeEcList != null && employeeEcList.size() > 0) {
            totalCount = employeeEcMapper.getTotalEcList(empinfoInputDTO);
        }
        resultDTO.setTotalCount(totalCount);
        jsonResult.setData(resultDTO);
        jsonResult.setMessage("获取奖惩列表成功");
        return jsonResult;
    }
}
