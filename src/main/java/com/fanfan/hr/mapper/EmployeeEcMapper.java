package com.fanfan.hr.mapper;

import com.fanfan.hr.pojo.EmployeeEc;

public interface EmployeeEcMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeEc record);

    int insertSelective(EmployeeEc record);

    EmployeeEc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeEc record);

    int updateByPrimaryKey(EmployeeEc record);
}