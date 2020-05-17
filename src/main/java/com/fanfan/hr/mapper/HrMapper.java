package com.fanfan.hr.mapper;

import com.fanfan.hr.common.HrResultDTO;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr queryUserByUserName(@Param("username") String username);

    List<HrResultDTO> getHrList(PageInputDTO pageInputDTO);

    Integer getAllHrList(PageInputDTO pageInputDTO);
}
