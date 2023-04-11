package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.Occupant;

import java.util.List;

public interface IOccupantService extends IService<Occupant> {

    List<Occupant> selectallbyuserid(Occupant occupant);
    Occupant selectbyoccupantid(Occupant occupant);
    int insertoccupant(Occupant occupant);
    int updateoccupant(Occupant occupant);
    int deleteoccupant(Occupant occupant);

}
