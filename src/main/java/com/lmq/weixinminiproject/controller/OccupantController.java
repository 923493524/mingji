package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.Occupant;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.service.IOccupantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/occupant")
public class OccupantController {
    @Autowired
    private IOccupantService occupantService;

    @RequestMapping("/selectallbyuserid")
    public Result selectallbyuserid(Occupant occupant){
        List<Occupant> occupants = occupantService.selectallbyuserid(occupant);
        return Result.success(occupants,1);
    }

    @RequestMapping("/selectbyoccupantid")
    public Result selectbyoccupantid(Occupant occupant){
        return Result.success(occupantService.selectbyoccupantid(occupant),1);
    }

    @RequestMapping("/insertoccupant")
    public Result insertoccupant(Occupant occupant){
        return Result.success(occupantService.insertoccupant(occupant),1);
    }

    @RequestMapping("/updateoccupant")
    public Result updateoccupant(Occupant occupant){
        return Result.success(occupantService.updateoccupant(occupant),1);
    }

    @RequestMapping("/deleteoccupant")
    public Result deleteoccupant(Occupant occupant){
        return Result.success(occupantService.deleteoccupant(occupant),1);
    }

}
