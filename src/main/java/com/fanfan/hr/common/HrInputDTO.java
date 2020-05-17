package com.fanfan.hr.common;

import com.fanfan.hr.pojo.Hr;

public class HrInputDTO extends Hr {
    //新增接口传 更新接口传
    private Integer roleId;
    //更新接口传
    private Integer hrRoleId;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getHrRoleId() {
        return hrRoleId;
    }

    public void setHrRoleId(Integer hrRoleId) {
        this.hrRoleId = hrRoleId;
    }
}
