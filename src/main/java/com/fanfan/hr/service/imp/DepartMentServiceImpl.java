package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.mapper.DepartmentMapper;
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
}
