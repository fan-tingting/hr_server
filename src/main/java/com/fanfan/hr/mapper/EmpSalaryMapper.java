package com.fanfan.hr.mapper;

import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.ShowSalaryDTO;
import com.fanfan.hr.pojo.EmpSalary;

import java.util.List;

public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    EmpSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);

    List<ShowSalaryDTO> showEmpSalary(EmpinfoInputDTO empinfoInputDTO);

    Integer showAllEmpSalary(EmpinfoInputDTO empinfoInputDTO);
}