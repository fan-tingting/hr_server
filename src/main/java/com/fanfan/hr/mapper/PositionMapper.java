package com.fanfan.hr.mapper;

import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.PositionDTO;
import com.fanfan.hr.common.SelectValue;
import com.fanfan.hr.pojo.Position;

import java.util.List;

public interface PositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);

    List<SelectValue> getPositionList(SelectValue selectValue);

    List<PositionDTO> getPositionLists(PageInputDTO pageInputDTO);

    Integer getAllPositionList(PageInputDTO pageInputDTO);
}