package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.*;
import com.fanfan.hr.common.util.StringUtil;
import com.fanfan.hr.mapper.DepartmentMapper;
import com.fanfan.hr.mapper.EmployeeMapper;
import com.fanfan.hr.mapper.PositionMapper;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.pojo.Position;
import com.fanfan.hr.service.EmpinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpinfoServiceImpl implements EmpinfoService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private PositionMapper positionMapper;


    //获取表格数据
    @Override
    public JsonResult getEmpinfo(EmpinfoInputDTO inputDTO) {
        JsonResult jsonResult = new JsonResult();
        // 1获取分页数据
        inputDTO.setBeginPage((inputDTO.getPage() - 1) * inputDTO.getPageSize());
        List<Employee> employeeList = employeeMapper.getEmpinfo(inputDTO);
        int totalCount = 0;
        if (employeeList != null && employeeList.size() > 0) {
            int empDepartmentId = 0;
            int empPositionId = 0;
            for (int i = 0; i < employeeList.size(); i++) {
                Employee employee = employeeList.get(i);
                //employee.setNationZh(NationEnum.getValue(employee.getNation()));
                //employee.setPoliticZh(PoliticEnum.getValue(employee.getPolitic()));
                empDepartmentId = employee.getDepartment();
                empPositionId = employee.getPosition();
                Department department = departmentMapper.selectByPrimaryKey(empDepartmentId);
                Position position = positionMapper.selectByPrimaryKey(empPositionId);
                employee.setPositionZh(position.getName());
                employee.setDepartmentZh(department.getName());
            }
            // 2获取总数据量
            totalCount = employeeMapper.getEmpinfoTotalCount(inputDTO);
        }
        EmpInfoDTO empInfoDTO = new EmpInfoDTO();
        empInfoDTO.setEmployeeList(employeeList);
        empInfoDTO.setTotalCount(totalCount);
        jsonResult.setData(empInfoDTO);
        return jsonResult;
    }

    //新增员工
    @Override
    public JsonResult addEmp(EmployeeDTO input) {
        JsonResult jsonResult = new JsonResult();
        Employee employee = new Employee();
        //字符串转date
        replaceAll(input, employee);
        if (employeeMapper.insert(employee) > 0) {
            jsonResult.setMessage("新增成功");
            jsonResult.setData(true);
            return jsonResult;
        }
        jsonResult.setMessage("新增失败");
        jsonResult.setData(false);
        return jsonResult;
    }

    //编辑员工
    @Override
    public JsonResult editEmp(EmployeeDTO input) {
        JsonResult jsonResult = new JsonResult();
        Employee employee = new Employee();
        //字符串转date
        replaceAll(input, employee);
        if (employeeMapper.updateByPrimaryKeySelective(employee) > 0) {
            jsonResult.setMessage("修改成功");
            jsonResult.setData(true);
            return jsonResult;
        }
        jsonResult.setMessage("修改失败");
        jsonResult.setData(false);
        return jsonResult;
    }


    private void replaceAll(EmployeeDTO input, Employee employee) {
        employee.setId(input.getId());
        //1
        employee.setName(input.getName());
        employee.setSex(input.getSex());
        employee.setIdcard(input.getIdcard());
        employee.setWedding(input.getWedding());
        employee.setNation(input.getNation());
        //5
        employee.setPlace(input.getPlace());
        employee.setPolitic(input.getPolitic());
        employee.setEmail(input.getEmail());
        employee.setPhone(input.getPhone());
        employee.setAddress(input.getAddress());
        //10
        employee.setDepartment(input.getDepartment());
        employee.setPosition(input.getPosition());
        employee.setEngageform(input.getEngageform());
        employee.setEducation(input.getEducation());
        employee.setMajor(input.getMajor());
        //15
        employee.setSchool(input.getSchool());
        employee.setWorkstate(input.getWorkstate());
        employee.setWorkid(input.getWorkid());
        employee.setPaperlimit(input.getPaperlimit());
        employee.setWorkage(input.getWorkage());
        //20
        employee.setBirthday(StringUtil.getDateFromStr(input.getBirthday()));
        employee.setBegindate(StringUtil.getDateFromStr(input.getBegindate()));
        employee.setConversiondate(StringUtil.getDateFromStr(input.getConversiondate()));
        employee.setLeavedate(StringUtil.getDateFromStr(input.getLeavedate()));
        employee.setBeginpaperdate(StringUtil.getDateFromStr(input.getBeginpaperdate()));
        employee.setEndpaperdate(StringUtil.getDateFromStr(input.getEndpaperdate()));
    }
}
