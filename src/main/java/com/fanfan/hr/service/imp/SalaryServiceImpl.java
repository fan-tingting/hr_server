package com.fanfan.hr.service.imp;

import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.common.PageResultDTO;
import com.fanfan.hr.mapper.SalaryMapper;
import com.fanfan.hr.pojo.Salary;
import com.fanfan.hr.pojo.SalaryKey;
import com.fanfan.hr.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    @Autowired
    private SalaryMapper salaryMapper;

    @Override
    public JsonResult getSalaryList(PageInputDTO pageInputDTO) {
        pageInputDTO.resetBeginPage();
        JsonResult jsonResult = new JsonResult();
        PageResultDTO resultDTO = new PageResultDTO();
        List<Salary> salaryList = salaryMapper.getSalaryList(pageInputDTO);
        Integer totalCount = 0;
        if(salaryList != null && salaryList.size() > 0) {
            totalCount = salaryMapper.getAllSalaryCount(pageInputDTO);
        }
        resultDTO.setTotalCount(totalCount);
        resultDTO.setData(salaryList);
        return jsonResult.ok(resultDTO,"获取套餐列表成功");
    }

    @Override
    public JsonResult addSalaryList(Salary salary) {
        JsonResult jsonResult = new JsonResult();
        if(salaryMapper.insert(salary) > 0) {
            return jsonResult.ok(true,"新增成功");
        }
        return jsonResult.ok(false,"新增失败");
    }

    @Override
    public JsonResult updateSalary(Salary salary) {
        JsonResult jsonResult = new JsonResult();
        if(salaryMapper.updateByPrimaryKeySelective(salary) > 0) {
            return jsonResult.ok(true,"更新成功");
        }
        return jsonResult.ok(false,"更新失败");
    }

    @Override
    public JsonResult deleteSalary(Salary salary) {
        JsonResult jsonResult = new JsonResult();
        SalaryKey key = new SalaryKey();
        key.setCreatedate(salary.getCreatedate());
        key.setId(salary.getId());
        if(salaryMapper.deleteByPrimaryKey(key) > 0) {
            return jsonResult.ok(true,"删除成功");
        }
        return jsonResult.ok(false,"删除失败");
    }
}
