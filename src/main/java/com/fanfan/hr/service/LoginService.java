package com.fanfan.hr.service;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;

public interface LoginService {

    public JsonResult login(LoginInputDTO inputDTO);

}
