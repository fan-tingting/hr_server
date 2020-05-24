package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.HrInputDTO;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.service.HrService;
import com.fanfan.hr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/role")
@RestController
@CrossOrigin("http://localhost:8080")
public class HrController {

    @Autowired
    private HrService hrService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/getHrList")
    @LoginRequired
    public JsonResult getHrList(PageInputDTO pageInputDTO) {
        return hrService.getHrList(pageInputDTO);
    }

    @PostMapping("/addHr")
    @LoginRequired
    public JsonResult addHr(@RequestBody HrInputDTO hrInputDTO) {
        return hrService.addHr(hrInputDTO);
    }

    @PostMapping("/updateHr")
    @LoginRequired
    public JsonResult updateHr(@RequestBody HrInputDTO hrInputDTO) {
        return hrService.updateHr(hrInputDTO);
    }

    @PostMapping("/deleteHr")
    @LoginRequired
    public JsonResult deleteHr(@RequestBody HrInputDTO hrInputDTO) {
        return hrService.deleteHr(hrInputDTO);
    }

    @GetMapping("/getRoleList")
    @LoginRequired
    public JsonResult getRoleList() {
        return roleService.getRoleList();
    }

}
