package com.fanfan.hr.service.imp;

import com.fanfan.hr.EmployeeSalInputDTO;
import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageResultDTO;
import com.fanfan.hr.mapper.EmpSalaryMapper;
import com.fanfan.hr.mapper.EmployeeSalMapper;
import com.fanfan.hr.mapper.SalaryMapper;
import com.fanfan.hr.pojo.EmpSalary;
import com.fanfan.hr.pojo.EmployeeSal;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.service.EmpSalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmpSalServiceImpl implements EmpSalService {

    @Autowired
    private EmployeeSalMapper employeeSalMapper;
    @Autowired
    private SalaryMapper salaryMapper;
    @Autowired
    private EmpSalaryMapper empSalaryMapper;

    @Override
    public JsonResult getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        PageResultDTO pageResultDTO = new PageResultDTO();
        empSalPageInputDTO.resetBeginPage();
        List<EmployeeSal> employeeSalList = employeeSalMapper.getEmpSalList(empSalPageInputDTO);
        Integer totalCount = 0;
        if(employeeSalList != null && employeeSalList.size() > 0) {
            totalCount = employeeSalMapper.getAllEmpSalCount(empSalPageInputDTO);
        }
        pageResultDTO.setData(employeeSalList);
        pageResultDTO.setTotalCount(totalCount);
        return jsonResult.ok(pageResultDTO,"获取员工工资列表成功");
    }

    @Override
    public JsonResult updateEmpSal(EmployeeSalInputDTO inputDTO) {
        JsonResult jsonResult = new JsonResult();
        Salary salary = salaryMapper.selectByPrimaryKey(inputDTO.getSalaryId());
        if(inputDTO.getBeforesalary() == null) {
            inputDTO.setBeforesalary(0);
        }
        inputDTO.setAftersalary(salary.getAllsalary());
        inputDTO.setSalarydate(new Date());
        if(employeeSalMapper.updateByPrimaryKeySelective(inputDTO) > 0) {
            EmpSalary empSalary = new EmpSalary();
            empSalary.setEid(inputDTO.getEid());
            empSalary.setSid(inputDTO.getSalaryId());
            empSalaryMapper.insert(empSalary);
            return jsonResult.ok(true,"更新成功");
        }
        return jsonResult.ok(false,"更新失败");
    }


}
