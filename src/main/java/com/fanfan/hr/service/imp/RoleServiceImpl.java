package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.mapper.RoleMapper;
import com.fanfan.hr.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public JsonResult getRoleList() {
        JsonResult jsonResult = new JsonResult();
        List<SelectValue> roleList = roleMapper.getRoleList();
        return jsonResult.ok(roleList,"获取角色列表成功");
    }
}
