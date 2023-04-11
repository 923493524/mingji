package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.Room;
import com.lmq.weixinminiproject.mapper.RoomMapper;
import com.lmq.weixinminiproject.service.IRoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService extends ServiceImpl<RoomMapper, Room> implements IRoomService {

    @Override
    public List<Room> selectbyhotelid(Hotel hotel) {
        return this.getBaseMapper().selectbyhotelid(hotel);
    }

    @Override
    public Room selectbyroomid(Room room) {
        return this.getBaseMapper().selectbyroomid(room);
    }
}
