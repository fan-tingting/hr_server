package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.LoginInputDTO;
import com.fanfan.hr.common.LoginResultDTO;
import com.fanfan.hr.common.util.RedisUtil;
import com.fanfan.hr.mapper.HrMapper;
import com.fanfan.hr.mapper.HrRoleMapper;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.pojo.Role;
import com.fanfan.hr.service.LoginService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;

@Service
public class LoginServiceImpl implements LoginService {

    private Logger logger = (Logger) LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private HrMapper hrMapper;
    @Autowired
    private HrRoleMapper hrRoleMapper;
    @Autowired
    private RedisUtil redisUtil;

    @Override
    public JsonResult login(LoginInputDTO inputDTO){
        JsonResult jsonResult = new JsonResult();
        //1 通过用户名取对象
        Hr hr = hrMapper.queryUserByUserName(inputDTO.getUsername());
        if(hr == null) {
            jsonResult.setMessage( "用户不存在");
            return jsonResult;
        }
        if (hr.getPassword().equals(inputDTO.getPassword())) {
            Role role = hrRoleMapper.queryRoleByHrId(hr.getId());
            String token = UUID.randomUUID().toString().replace("-", "");
            LoginResultDTO resultDTO = new LoginResultDTO();
            resultDTO.setHr(hr);
            resultDTO.setRole(role);
            resultDTO.setToken(token);
            try {
                redisUtil.set("" + hr.getId(), null, token);
            } catch (Exception e) {
                jsonResult.setData(null);
                jsonResult.setMessage(e.getMessage());
                return jsonResult;
            }
            jsonResult.setData(resultDTO);
            jsonResult.setMessage("登录成功");
            return jsonResult;
        }
        jsonResult.setMessage("用户密码错误");
        return jsonResult;
    }

    @Override
    public JsonResult loginOut(Hr hr) {
        JsonResult jsonResult = new JsonResult();
        try {
            redisUtil.delete("" + hr.getId());
        }catch (Exception e) {
            logger.warning("redis信息删除失败");
        }
        return jsonResult.ok(true,"退出登录成功");
    }
}
