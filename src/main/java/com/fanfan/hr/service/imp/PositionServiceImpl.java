package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.mapper.PositionMapper;
import com.fanfan.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public JsonResult getPositionList(SelectValue selectValue) {
        JsonResult jsonResult = new JsonResult();
        if(selectValue == null) {
            selectValue = new SelectValue();
        }
        List<SelectValue> positionList = positionMapper.getPositionList(selectValue);
        jsonResult.setData(positionList);
        jsonResult.setMessage("获取职位列表成功");
        return jsonResult;
    }
}
