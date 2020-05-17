package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageResultDTO;
import com.fanfan.hr.mapper.EmployeeTrainMapper;
import com.fanfan.hr.pojo.EmployeeTrain;
import com.fanfan.hr.service.EmpTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpTrainServiceImpl implements EmpTrainService {

    @Autowired
    private EmployeeTrainMapper employeeTrainMapper;

    @Override
    public JsonResult getEmpTrainList(IdPageInputDTO pageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        PageResultDTO resultDTO = new PageResultDTO();
        Integer totalCount = 0;
        List<EmployeeTrain> employeeTrainList = employeeTrainMapper.getEmpTrainList(pageInputDTO);
        if(employeeTrainList != null && employeeTrainList.size() > 0) {
            totalCount = employeeTrainMapper.getAllEmpTrain(pageInputDTO);
        }
        resultDTO.setData(employeeTrainList);
        resultDTO.setTotalCount(totalCount);
        return jsonResult.ok(resultDTO,"获取培训列表成功");
    }

    @Override
    public JsonResult addEmpTrain(EmployeeTrain employeeTrain) {
        JsonResult jsonResult = new JsonResult();
        if(employeeTrainMapper.insert(employeeTrain) > 0) {
            return jsonResult.ok(true,"插入培训记录成功");
        }
        return jsonResult.ok(false,"插入培训记录失败");
    }

    @Override
    public JsonResult updateEmpTrain(EmployeeTrain employeeTrain) {
        JsonResult jsonResult = new JsonResult();
        if(employeeTrainMapper.updateByPrimaryKeySelective(employeeTrain) > 1) {
            return jsonResult.ok(true,"更新成功");
        }
        return jsonResult.ok(false,"更新失败");
    }

    @Override
    public JsonResult deleteEmpTrain(EmployeeTrain employeeTrain) {
        JsonResult jsonResult = new JsonResult();
        if(employeeTrainMapper.deleteByPrimaryKey(employeeTrain.getId()) > 0) {
            return jsonResult.ok(true,"删除成功");
        }
        return jsonResult.ok(false,"删除失败");
    }
}
