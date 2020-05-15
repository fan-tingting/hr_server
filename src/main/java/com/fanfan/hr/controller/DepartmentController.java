package com.fanfan.hr.controller;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.EmployeeEc;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.EmpEcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ec")
@RestController
@CrossOrigin("http://localhost:8080")
public class DepartmentController {

   @Autowired
    private DepartMentService departMentService;

   @GetMapping("/getDepartmentList")
    public JsonResult getDepartmentList(PageInputDTO pageInputDTO) {
       return departMentService.getDepartmentList(pageInputDTO);
   }

   @PostMapping("/addDepartment")
    public JsonResult addDepartmentList(@RequestBody Department department) {
       return departMentService.addDepartmentList(department);
   }

   @PostMapping("/updateDepartment")
    public JsonResult updateDepartment(@RequestBody Department department) {
       return departMentService.updateDepartment(department);
   }

   @PostMapping("/deleteDepartment")
    public JsonResult deleteDepartment(@RequestBody Department department) {
       return departMentService.deleteDepartment(department);
   }

}
