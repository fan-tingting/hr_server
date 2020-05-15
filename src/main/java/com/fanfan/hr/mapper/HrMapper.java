package com.fanfan.hr.mapper;

import com.fanfan.hr.pojo.Hr;
import org.apache.ibatis.annotations.Param;

public interface HrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr queryUserByUserName(@Param("username") String username);
}
