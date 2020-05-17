package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.PageResultDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.mapper.DepartmentMapper;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.service.DepartMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartMentServiceImpl implements DepartMentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public JsonResult getDepartMentList() {
        JsonResult jsonResult = new JsonResult();
        List<SelectValue> selectValueList = departmentMapper.getDepartMentList();
        jsonResult.setMessage("获取部门列表成功");
        jsonResult.setData(selectValueList);
        return jsonResult;
    }

    @Override
    public JsonResult getDepartmentList(PageInputDTO pageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        PageResultDTO resultDTO = new PageResultDTO();
        pageInputDTO.resetBeginPage();
        List<Department> departments = departmentMapper.getDepartmentList(pageInputDTO);
        Integer totalCount = 0;
        if(departments != null && departments.size() > 0) {
            totalCount = departmentMapper.getAllDepartmentCount(pageInputDTO);
        }
        resultDTO.setTotalCount(totalCount);
        resultDTO.setData(departments);
        jsonResult.setData(resultDTO);
        jsonResult.setMessage("获取列表数据成功");
        return jsonResult;
    }

    @Override
    public JsonResult addDepartmentList(Department department) {
        JsonResult jsonResult = new JsonResult();
        if(department != null) {
            department.setEnabled(false);
        }
        if(departmentMapper.insert(department) > 0) {
            return jsonResult.ok(true,"新增成功");
        }
        return jsonResult.ok(false,"新增失败");
    }

    @Override
    public JsonResult updateDepartment(Department department) {
        JsonResult jsonResult = new JsonResult();
        if(departmentMapper.updateByPrimaryKeySelective(department) > 0) {
            return jsonResult.ok(true,"修改成功");
        }
        return jsonResult.ok(false,"修改失败");
    }

    @Override
    public JsonResult deleteDepartment(Department department) {
        JsonResult jsonResult = new JsonResult();
        if(departmentMapper.deleteByPrimaryKey(department.getId()) > 0) {
            return jsonResult.ok(true,"删除成功");
        }
        return jsonResult.ok(false,"删除失败");
    }
}
