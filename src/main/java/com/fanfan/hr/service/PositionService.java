package com.fanfan.hr.service;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.pojo.Position;

public interface PositionService {

     JsonResult getPositionList(SelectValue selectValue);

     JsonResult getPositionList(PageInputDTO pageInputDTO);

     JsonResult addPosition(Position position);

     JsonResult updatePosition(Position position);

     JsonResult deletePosition(Integer id);
}
