package com.fanfan.hr.controller;

import com.fanfan.hr.common.EmpRemoveInputDTO;
import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.mapper.EmployeeMapper;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.EmployeeRemove;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.EmpRemoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/empRemove")
@RestController
@CrossOrigin("http://localhost:8080")
public class EmpRemoveController {

    @Autowired
    private EmpRemoveService empRemoveService;

    @PostMapping("/removeEmp")
    public JsonResult removeEmp(@RequestBody EmployeeRemove employeeRemove) {
        return empRemoveService.removeEmp(employeeRemove);
    }

    @GetMapping("/getEmpRemoveInfo")
    public JsonResult getEmpRemoveInfo(IdPageInputDTO pageInputDTO) {
        return empRemoveService.getEmpRemoveInfo(pageInputDTO);
    }

    @PostMapping("/addEmpRemove")
    public JsonResult addEmpRemove(@RequestBody EmployeeRemove employeeRemove) {
        return empRemoveService.addEmpRemove(employeeRemove);
    }

    @PostMapping("/updateEmpRemove")
    public JsonResult updateEmpRemove(@RequestBody EmployeeRemove employeeRemove) {
        return empRemoveService.updateEmpRemove(employeeRemove);
    }
}
