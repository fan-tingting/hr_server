package com.fanfan.hr.mapper;

import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.pojo.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    List<SelectValue> getRoleList();
}