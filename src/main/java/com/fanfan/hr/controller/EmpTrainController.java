package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.EmployeeTrain;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.EmpTrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/empTrain")
@RestController
@CrossOrigin("http://localhost:8080")
public class EmpTrainController {


    @Autowired
    private EmpTrainService empTrainService;

    @GetMapping("/getEmpTrainList")
    @LoginRequired
    public JsonResult getEmpTrainList(IdPageInputDTO pageInputDTO) {
        return empTrainService.getEmpTrainList(pageInputDTO);
    }

    @PostMapping("/addEmpTrain")
    @LoginRequired
    public JsonResult addEmpTrain(@RequestBody EmployeeTrain employeeTrain) {
        return empTrainService.addEmpTrain(employeeTrain);
    }

    @PostMapping("/updateEmpTrain")
    @LoginRequired
    public JsonResult updateEmpTrain(@RequestBody EmployeeTrain employeeTrain) {
        return empTrainService.updateEmpTrain(employeeTrain);
    }

    @PostMapping("/deleteEmpTrain")
    @LoginRequired
    public JsonResult deleteEmpTrain(@RequestBody EmployeeTrain employeeTrain) {
        return empTrainService.deleteEmpTrain(employeeTrain);
    }

}
