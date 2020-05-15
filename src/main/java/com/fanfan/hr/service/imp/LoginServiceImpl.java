package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;
import com.fanfan.hr.common.LoginResultDTO;
import com.fanfan.hr.mapper.HrMapper;
import com.fanfan.hr.mapper.HrRoleMapper;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.pojo.Role;
import com.fanfan.hr.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private HrMapper hrMapper;
    @Autowired
    private HrRoleMapper hrRoleMapper;

    @Override
    public JsonResult login(LoginInputDTO inputDTO) {
        JsonResult jsonResult = new JsonResult();
        //1 通过用户名取对象
        Hr hr = hrMapper.queryUserByUserName(inputDTO.getUsername());
        if(hr == null) {
            jsonResult.setMessage( "用户不存在");
            return jsonResult;
        }
        if (hr.getPassword().equals(inputDTO.getPassword())) {
            Role role = hrRoleMapper.queryRoleByHrId(hr.getId());
            LoginResultDTO resultDTO = new LoginResultDTO();
            resultDTO.setHr(hr);
            resultDTO.setRole(role);
            jsonResult.setData(resultDTO);
            jsonResult.setMessage("登录成功");
            return jsonResult;
        }
        jsonResult.setMessage("用户密码错误");
        return jsonResult;
    }
}
