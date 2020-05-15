package com.fanfan.hr.mapper;

import com.fanfan.hr.pojo.EmployeeSal;

public interface EmployeeSalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeSal record);

    int insertSelective(EmployeeSal record);

    EmployeeSal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeSal record);

    int updateByPrimaryKey(EmployeeSal record);
}