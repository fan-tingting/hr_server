package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.EmpEcResultDTO;
import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.mapper.EmployeeEcMapper;
import com.fanfan.hr.mapper.EmployeeMapper;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.pojo.EmployeeEc;
import com.fanfan.hr.service.EmpEcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpEcServiceImpl implements EmpEcService {

    @Autowired
    private EmployeeEcMapper employeeEcMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

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

    @Override
    public JsonResult addEmpEc(EmployeeEc employeeEc) {
        JsonResult jsonResult = new JsonResult();
        Employee employee = employeeMapper.selectByPrimaryKey(employeeEc.getEid());
        if(employee == null) {
            jsonResult.setData(false);
            jsonResult.setMessage("员工不存在,新增失败");
            return jsonResult;
        }
        if(employeeEcMapper.insert(employeeEc) > 0) {
            jsonResult.setMessage("新增成功");
            jsonResult.setData(true);
            return jsonResult;
        }
        jsonResult.setData(false);
        jsonResult.setMessage("新增失败");
        return jsonResult;
    }

    @Override
    public JsonResult updateEmpEc(EmployeeEc employeeEc) {
        JsonResult jsonResult = new JsonResult();
        if(employeeEcMapper.updateByPrimaryKeySelective(employeeEc) > 1) {
            jsonResult.setData(true);
            jsonResult.setMessage("修改成功");
            return jsonResult;
        }
        jsonResult.setData(false);
        jsonResult.setMessage("修改失败");
        return jsonResult;
    }

    @Override
    public JsonResult deleteEmpEc(Integer id) {
        JsonResult jsonResult = new JsonResult();
        if(employeeEcMapper.deleteByPrimaryKey(id) > 0) {
            jsonResult.setData(true);
            jsonResult.setMessage("删除成功");
            return jsonResult;
        }
        jsonResult.setData(false);
        jsonResult.setMessage("删除失败");
        return jsonResult;
    }


}
