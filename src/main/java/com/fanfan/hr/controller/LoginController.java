package com.fanfan.hr.controller;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.service.LoginService;
import com.mysql.cj.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8080")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public JsonResult login(@RequestBody LoginInputDTO inputDTO) {
        JsonResult result = new JsonResult();
        if(StringUtils.isNullOrEmpty(inputDTO.getUsername()) &&
        StringUtils.isNullOrEmpty(inputDTO.getPassword())) {
            result.setMessage("参数错误");
            return result;
        }
        return loginService.login(inputDTO);
    }
    //只传Hr的id
    @PostMapping("/loginOut")
    public JsonResult loginOut(@RequestBody Hr hr) {
        return loginService.loginOut(hr);
    }
}
