package com.fanfan.hr.mapper;

import com.fanfan.hr.common.EmpRemoveDTO;
import com.fanfan.hr.common.EmpinfoInputDTO;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmpinfo(EmpinfoInputDTO inputDTO);

    int getEmpinfoTotalCount(EmpinfoInputDTO inputDTO);

    List<EmpRemoveDTO> getEmpRemoveInfo(PageInputDTO pageInputDTO);

    Integer getAllEmpRemoveCount(PageInputDTO pageInputDTO);
}
