package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.*;
import com.fanfan.hr.mapper.PositionMapper;
import com.fanfan.hr.pojo.Position;
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

    @Override
    public JsonResult getPositionList(PageInputDTO pageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        pageInputDTO.resetBeginPage();
        PageResultDTO pageResultDTO = new PageResultDTO();
        Integer totalCount = 0;
        List<PositionDTO> positions = positionMapper.getPositionLists(pageInputDTO);
        if(positions != null && positions.size() > 0) {
            totalCount = positionMapper.getAllPositionList(pageInputDTO);
        }
        pageResultDTO.setData(positions);
        pageResultDTO.setTotalCount(totalCount);
        return jsonResult.ok(pageResultDTO,"获取职位列表成功");
    }

    @Override
    public JsonResult addPosition(Position position) {
        JsonResult jsonResult = new JsonResult();
        if(positionMapper.insert(position) > 0) {
            return jsonResult.ok(true,"新增成功");
        }
        return jsonResult.ok(false,"新增失败");
    }
}
