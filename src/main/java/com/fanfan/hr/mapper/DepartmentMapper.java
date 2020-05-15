package com.fanfan.hr.mapper;

import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<SelectValue> getDepartMentList();

    List<Department> getDepartmentList(PageInputDTO pageInputDTO);

    Integer getAllDepartmentCount(PageInputDTO pageInputDTO);
}