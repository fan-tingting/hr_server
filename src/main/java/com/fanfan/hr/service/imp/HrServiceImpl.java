package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.*;
import com.fanfan.hr.mapper.HrMapper;
import com.fanfan.hr.mapper.HrRoleMapper;
import com.fanfan.hr.mapper.RoleMapper;
import com.fanfan.hr.pojo.Hr;
import com.fanfan.hr.pojo.HrRole;
import com.fanfan.hr.pojo.Role;
import com.fanfan.hr.service.HrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrServiceImpl implements HrService {

    @Autowired
    private HrMapper hrMapper;
    @Autowired
    private HrRoleMapper hrRoleMapper;

    @Override
    public JsonResult getHrList(PageInputDTO pageInputDTO) {
        JsonResult jsonResult = new JsonResult();
        PageResultDTO resultDTO = new PageResultDTO();
        pageInputDTO.resetBeginPage();
        Integer totalCount = 0;
        List<HrResultDTO> hrList = hrMapper.getHrList(pageInputDTO);
        if(hrList != null && hrList.size() > 0) {
            totalCount = hrMapper.getAllHrList(pageInputDTO);
        }
        resultDTO.setTotalCount(totalCount);
        resultDTO.setData(hrList);
        return jsonResult.ok(resultDTO,"获取hr列表成功");
    }

    @Override
    public JsonResult addHr(HrInputDTO hrInputDTO) {
        JsonResult jsonResult = new JsonResult();
        if(hrMapper.insert(hrInputDTO) > 0) {
            HrRole hrRole = new HrRole();
            hrRole.setHrid(hrInputDTO.getId());
            hrRole.setRid(hrInputDTO.getRoleId());
            hrRoleMapper.insert(hrRole);
            return jsonResult.ok(true,"新增hr成功");
        }
        return jsonResult.ok(false,"新增hr失败");
    }

    @Override
    public JsonResult updateHr(HrInputDTO hrInputDTO) {
        JsonResult jsonResult = new JsonResult();
        if(hrMapper.updateByPrimaryKeySelective(hrInputDTO) > 0) {
            HrRole hrRole = hrRoleMapper.selectByPrimaryKey(hrInputDTO.getHrRoleId());
            if(hrRole.getRid() != hrInputDTO.getRoleId()) {
                hrRole.setRid(hrInputDTO.getRoleId());
                hrRoleMapper.updateByPrimaryKeySelective(hrRole);
            }
            jsonResult.ok(true,"更新成功");
        }
        return jsonResult.ok(false,"更新失败");
    }

    @Override
    public JsonResult deleteHr(HrInputDTO hrInputDTO) {
        JsonResult jsonResult = new JsonResult();
        if(hrRoleMapper.deleteByPrimaryKey(hrInputDTO.getHrRoleId()) > 0) {
            if(hrMapper.deleteByPrimaryKey(hrInputDTO.getId()) > 0) {
                return jsonResult.ok(true,"删除成功");
            }
        }
        return jsonResult.ok(false,"删除失败");
    }
}
