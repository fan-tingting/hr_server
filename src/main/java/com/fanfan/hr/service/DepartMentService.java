package com.fanfan.hr.service;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;

public interface DepartMentService {
    JsonResult getDepartMentList();

    JsonResult getDepartmentList(PageInputDTO pageInputDTO);

    JsonResult addDepartmentList(Department department);

    JsonResult updateDepartment(Department department);

    JsonResult deleteDepartment(Department department);
}
