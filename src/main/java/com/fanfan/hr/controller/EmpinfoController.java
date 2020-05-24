package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.*;
import com.fanfan.hr.common.util.IntegerUtil;
import com.fanfan.hr.pojo.Employee;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.EmpinfoService;
import com.fanfan.hr.service.LoginService;
import com.fanfan.hr.service.PositionService;
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
    @Autowired
    private DepartMentService departMentService;
    @Autowired
    private PositionService positionService;

    @GetMapping("/basicinfo")
    @LoginRequired
    public JsonResult getEmpinfo(EmpinfoInputDTO inputDTO) {
        JsonResult result = new JsonResult();
        if(!IntegerUtil.judgeInteger(inputDTO.getPage()) || !IntegerUtil.judgeInteger(inputDTO.getPageSize())){
            result.setMessage("页码传值错误");
            return result;
        }
        return empinfoService.getEmpinfo(inputDTO);
    }
    @PostMapping("/addempinfo")
    @LoginRequired
    public JsonResult addEmpinfo(@RequestBody EmployeeDTO input) {
        return empinfoService.addEmp(input);
    }

    @PostMapping("/editempinfo")
    @LoginRequired
    public JsonResult editEmpinfo(@RequestBody EmployeeDTO input) {
        return empinfoService.editEmp(input);
    }

    @PostMapping("/deleteEmpInfo")
    @LoginRequired
    public JsonResult deleteEmpInfo(@RequestBody EmployeeDTO input) {
        return empinfoService.deleteEmpInfo(input.getId());
    }

    @GetMapping("/getDepartMentList")
    @LoginRequired
    public JsonResult getDepartMentList() {
        return departMentService.getDepartMentList();
    }

    @GetMapping("/getPositionList")
    @LoginRequired
    public JsonResult getPositionList(SelectValue selectValue) {
        return positionService.getPositionList(selectValue);
    }
}
