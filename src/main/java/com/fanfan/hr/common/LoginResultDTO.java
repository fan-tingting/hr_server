package com.fanfan.hr.common;

import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.pojo.Role;

public class LoginResultDTO {

    private Hr hr;

    private Role role;

    private String token;

    public Hr getHr() {
        return hr;
    }

    public void setHr(Hr hr) {
        this.hr = hr;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
