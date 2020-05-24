package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sa")
@RestController
@CrossOrigin("http://localhost:8080")
public class SalaryController {

    @Autowired
    private SalaryService salaryService;

    @GetMapping("/getSalary")
    @LoginRequired
    public JsonResult getSalaryList(PageInputDTO pageInputDTO) {
        return salaryService.getSalaryList(pageInputDTO);
    }

    @PostMapping("/addSalary")
    @LoginRequired
    public JsonResult addSalary(@RequestBody Salary salary) {
        return salaryService.addSalaryList(salary);
    }

    @PostMapping("/updateSalary")
    @LoginRequired
    public JsonResult updateSalary(@RequestBody Salary salary) {
        return salaryService.updateSalary(salary);
    }

    @PostMapping("/deleteSalary")
    @LoginRequired
    public JsonResult deleteSalary(@RequestBody Salary salary) {
        return salaryService.deleteSalary(salary);
    }

}
