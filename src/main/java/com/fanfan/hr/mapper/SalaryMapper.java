package com.fanfan.hr.mapper;

import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.pojo.SalaryKey;

import java.util.List;

public interface SalaryMapper {
    int deleteByPrimaryKey(SalaryKey key);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(SalaryKey key);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getSalaryList(PageInputDTO pageInputDTO);

    Integer getAllSalaryCount(PageInputDTO pageInputDTO);
}