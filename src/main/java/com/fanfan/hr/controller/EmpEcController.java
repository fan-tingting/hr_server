package com.fanfan.hr.controller;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.EmployeeDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.common.util.IntegerUtil;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.EmpEcService;
import com.fanfan.hr.service.EmpinfoService;
import com.fanfan.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ec")
@RestController
@CrossOrigin("http://localhost:8080")
public class EmpEcController {

   @Autowired
   private EmpEcService empEcService;

   @GetMapping("/getEcList")
   public JsonResult getEcList(EmpinfoInputDTO empinfoInputDTO) {
       return empEcService.getEcList(empinfoInputDTO);
   }

}
