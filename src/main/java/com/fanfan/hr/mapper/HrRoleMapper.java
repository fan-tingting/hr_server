package com.fanfan.hr.mapper;

import com.fanfan.hr.pojo.HrRole;
import com.fanfan.hr.pojo.Role;

public interface HrRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HrRole record);

    int insertSelective(HrRole record);

    HrRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HrRole record);

    int updateByPrimaryKey(HrRole record);

    Role queryRoleByHrId(Integer id);
}
