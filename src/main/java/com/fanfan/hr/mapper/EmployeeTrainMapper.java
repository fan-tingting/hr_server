package com.fanfan.hr.mapper;

import com.fanfan.hr.common.IdPageInputDTO;
import com.fanfan.hr.pojo.EmployeeTrain;

import java.util.List;

public interface EmployeeTrainMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);

    EmployeeTrain selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmployeeTrain record);

    int updateByPrimaryKey(EmployeeTrain record);

    List<EmployeeTrain> getEmpTrainList(IdPageInputDTO pageInputDTO);

    Integer getAllEmpTrain(IdPageInputDTO pageInputDTO);
}