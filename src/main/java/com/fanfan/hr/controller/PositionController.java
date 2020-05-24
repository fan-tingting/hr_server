package com.fanfan.hr.controller;

import com.fanfan.hr.annotation.LoginRequired;
import com.fanfan.hr.common.JsonResult;
import com.fanfan.hr.common.PageInputDTO;
import com.fanfan.hr.pojo.Department;
import com.fanfan.hr.pojo.Position;
import com.fanfan.hr.service.DepartMentService;
import com.fanfan.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ps")
@RestController
@CrossOrigin("http://localhost:8080")
public class PositionController {

    @Autowired
    private PositionService positionService;

    @GetMapping("/getPositionList")
    @LoginRequired
    public JsonResult getPositionList(PageInputDTO pageInputDTO) {
        return positionService.getPositionList(pageInputDTO);
    }

    @PostMapping("/addPostion")
    @LoginRequired
    public JsonResult addPosition(@RequestBody Position position) {
        return positionService.addPosition(position);
    }

    @PostMapping("/updatePosition")
    @LoginRequired
    public JsonResult updatePosition(@RequestBody Position position) {
        return positionService.updatePosition(position);
    }

    @PostMapping("/deletePosition")
    @LoginRequired
    public JsonResult deletePosition(@RequestBody Position position) {
        return positionService.deletePosition(position.getId());
    }

}
