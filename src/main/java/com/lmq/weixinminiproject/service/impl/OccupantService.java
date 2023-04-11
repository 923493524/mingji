package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.Occupant;
import com.lmq.weixinminiproject.mapper.OccupantMapper;
import com.lmq.weixinminiproject.service.IOccupantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccupantService extends ServiceImpl<OccupantMapper, Occupant> implements IOccupantService {

    @Override
    public List<Occupant> selectallbyuserid(Occupant occupant) {
        return this.getBaseMapper().selectallbyuserid(occupant);
    }

    @Override
    public Occupant selectbyoccupantid(Occupant occupant) {
        return this.getBaseMapper().selectbyoccupantid(occupant);
    }

    @Override
    public int insertoccupant(Occupant occupant) {
        return this.getBaseMapper().insertoccupant(occupant);
    }

    @Override
    public int updateoccupant(Occupant occupant) {
        return this.getBaseMapper().updateoccupant(occupant);
    }

    @Override
    public int deleteoccupant(Occupant occupant) {
        return this.getBaseMapper().deleteoccupant(occupant);
    }
}
