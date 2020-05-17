package com.fanfan.hr.controller;

import com.fanfan.hr.EmployeeSalInputDTO;
import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.pojo.EmployeeSal;
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

   @GetMapping("/geiEmpSalList")
    public JsonResult getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO) {
        return empSalService.getEmpSalList(empSalPageInputDTO);
   }

   /*
   获取套餐列表
   * */
   @GetMapping("/getSalarySelector")
   public JsonResult getSalarySelector() {
       return salaryService.getSalarySelector();
   }

    /**
     * 分配套餐
     */
   @PostMapping("/updateEmpSal")
    public JsonResult updateEmpSal(@RequestBody EmployeeSalInputDTO inputDTO) {
       return empSalService.updateEmpSal(inputDTO);
   }


}
