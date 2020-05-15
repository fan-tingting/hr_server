package com.fanfan.hr.controller;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ec")
@RestController
@CrossOrigin("http://localhost:8080")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/getSalary")
    public JsonResult getSalaryList(PageInputDTO pageInputDTO) {
        return salaryService.getSalaryList(pageInputDTO);
    }

    @PostMapping("/addSalary")
    public JsonResult addSalary(@RequestBody Salary salary) {
        return salaryService.addSalaryList(salary);
    }

    @PostMapping("/updateSalary")
    public JsonResult updateSalary(@RequestBody Salary salary) {
        return salaryService.updateSalary(salary);
    }

    @PostMapping("/deleteSalary")
    public JsonResult deleteSalary(@RequestBody Salary salary) {
        return salaryService.deleteSalary(salary);
    }

}