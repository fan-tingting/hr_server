package com.fanfan.hr.controller;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.EmployeeDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;
import com.fanfan.hr.common.util.IntegerUtil;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.service.EmpinfoService;
import com.fanfan.hr.service.LoginService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("/emp")
@RestController
@CrossOrigin("http://localhost:8080")
public class EmpinfoController {

    @Autowired
    private EmpinfoService empinfoService;

    @GetMapping("/basicinfo")
    public JsonResult getEmpinfo(EmpinfoInputDTO inputDTO) {
        JsonResult result = new JsonResult();
        if(!IntegerUtil.judgeInteger(inputDTO.getPage()) || !IntegerUtil.judgeInteger(inputDTO.getPageSize())){
            result.setMessage("页码传值错误");
            return result;
        }
        return empinfoService.getEmpinfo(inputDTO);
    }
    @PostMapping("/addempinfo")
    public JsonResult addEmpinfo(@RequestBody EmployeeDTO input) {
        JsonResult result = new JsonResult();
        return empinfoService.addEmp(input);
    }

    @PostMapping("/editempinfo")
    public JsonResult editEmpinfo(@RequestBody EmployeeDTO input) {
        JsonResult result = new JsonResult();
        return empinfoService.editEmp(input);
    }

}
