package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.*;
import com.fanfan.hr.mapper.EmployeeMapper;
import com.fanfan.hr.mapper.EmployeeRemoveMapper;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.pojo.EmployeeRemove;
import com.fanfan.hr.service.EmpRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpRemoveServiceImpl implements EmpRemoveService {

    @Autowired
    private EmployeeRemoveMapper employeeRemoveMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public JsonResult removeEmp(EmployeeRemove employeeRemove) {
        JsonResult jsonResult = new JsonResult();
        Employee employee = new Employee();
        employee.setId(employeeRemove.getEid());
        employee.setDepartment(employeeRemove.getAfterdepartment());
        employee.setPosition(employeeRemove.getAfterjob());
        employeeRemove.setRemovedate(new Date());
        employeeMapper.updateByPrimaryKeySelective(employee);
        if(employeeRemoveMapper.insert(employeeRemove) > 0) {
            return jsonResult.ok(true,"更换部门成功");
        }
        return jsonResult.ok(false,"更换部门失败");
    }

    @Override
    public JsonResult getEmpRemoveInfo(IdPageInputDTO pageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        PageResultDTO resultDTO = new PageResultDTO();
        pageInputDTO.resetBeginPage();
        List<EmpRemoveDTO> empRemoveDTOList = employeeMapper.getEmpRemoveInfo(pageInputDTO);
        Integer totalPage = 0;
        if(empRemoveDTOList != null && empRemoveDTOList.size() > 0) {
            totalPage = employeeMapper.getAllEmpRemoveCount(pageInputDTO);
        }
        resultDTO.setData(empRemoveDTOList);
        resultDTO.setTotalCount(totalPage);
        return jsonResult.ok(resultDTO,"获取部门调动列表成功");
    }

    @Override
    public JsonResult addEmpRemove(EmployeeRemove employeeRemove) {
        JsonResult jsonResult = new JsonResult();
        Employee employee = employeeMapper.selectByPrimaryKey(employeeRemove.getEid());
        if(employee == null) {
            return jsonResult.ok(false,"员工不存在，请核实员工工号");
        }
        if(employeeRemoveMapper.insert(employeeRemove) > 0) {
            return jsonResult.ok(true,"新增员工成功");
        }
        return jsonResult.ok(false,"新增员工失败");
    }

    @Override
    public JsonResult updateEmpRemove(EmployeeRemove employeeRemove) {
        JsonResult jsonResult = new JsonResult();
        if(employeeRemoveMapper.updateByPrimaryKeySelective(employeeRemove) > 0) {
            return jsonResult.ok(true,"更新成功");
        }
        return jsonResult.ok(false,"更新失败");
    }
}
