package com.fanfan.hr.mapper;

import com.fanfan.hr.common.EmpSalPageInputDTO;
import com.fanfan.hr.pojo.EmployeeSal;

import java.util.List;

public interface EmployeeSalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeSal record);

    int insertSelective(EmployeeSal record);

    EmployeeSal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeSal record);

    int updateByPrimaryKey(EmployeeSal record);

    List<EmployeeSal> getEmpSalList(EmpSalPageInputDTO empSalPageInputDTO);

    Integer getAllEmpSalCount(EmpSalPageInputDTO empSalPageInputDTO);
}