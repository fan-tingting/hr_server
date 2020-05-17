package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.EmpRemoveInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.mapper.EmployeeMapper;
import com.fanfan.hr.mapper.EmployeeRemoveMapper;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.pojo.EmployeeRemove;
import com.fanfan.hr.service.EmpRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        employeeMapper.updateByPrimaryKeySelective(employee);
        if(employeeRemoveMapper.insert(employeeRemove) > 0) {
            return jsonResult.ok(true,"更换部门成功");
        }
        return jsonResult.ok(false,"更换部门失败");
    }
}
