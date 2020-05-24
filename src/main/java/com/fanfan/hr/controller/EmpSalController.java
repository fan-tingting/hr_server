package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.EmployeeSalInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.service.EmpSalService;
import com.fanfan.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/empSal")
@RestController
@CrossOrigin("http://localhost:8080")
public class EmpSalController {

   @Autowired
    private EmpSalService empSalService;
   @Autowired
    private SalaryService salaryService;

   @GetMapping("/getEmpSalList")
   @LoginRequired
   public JsonResult getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO) {
        return empSalService.getEmpSalList(empSalPageInputDTO);
   }

   /*
   获取套餐列表
   * */
   @GetMapping("/getSalarySelector")
   @LoginRequired
   public JsonResult getSalarySelector() {
       return salaryService.getSalarySelector();
   }

    /**
     * 分配套餐
     */
   @PostMapping("/updateEmpSal")
   @LoginRequired
    public JsonResult updateEmpSal(@RequestBody EmployeeSalInputDTO inputDTO) {
       return empSalService.updateEmpSal(inputDTO);
   }

    /**
     * 获取工资表数据
     */
    @GetMapping("/showSalary")
    @LoginRequired
    public JsonResult showEmpSalary(EmpinfoInputDTO empinfoInputDTO) {
        return empSalService.showEmpSalary(empinfoInputDTO);
    }
}
