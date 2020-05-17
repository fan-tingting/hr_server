package com.fanfan.hr.mapper;

import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.pojo.SalaryKey;

import java.util.List;

public interface SalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Salary record);

    int updateByPrimaryKey(Salary record);

    List<Salary> getSalaryList(PageInputDTO pageInputDTO);

    Integer getAllSalaryCount(PageInputDTO pageInputDTO);

    List<SelectValue> getSalarySelector();
}