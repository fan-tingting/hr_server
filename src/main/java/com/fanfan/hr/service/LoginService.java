package com.fanfan.hr.service;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;
import com.fanfan.hr.pojo.Hr;

public interface LoginService {

    public JsonResult login(LoginInputDTO inputDTO);

    JsonResult loginOut(Hr hr);
}
