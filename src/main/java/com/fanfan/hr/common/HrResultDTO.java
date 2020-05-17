package com.fanfan.hr.common;

public class HrResultDTO {

    private Integer id;

    private String name;

    private String phone;

    private String roleName;

    private Integer hrRoleId;

    private boolean enable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public Integer getHrRoleId() {
        return hrRoleId;
    }

    public void setHrRoleId(Integer hrRoleId) {
        this.hrRoleId = hrRoleId;
    }
}
