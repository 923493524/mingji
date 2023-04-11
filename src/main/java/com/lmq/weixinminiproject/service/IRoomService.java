package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.Room;

import java.util.List;

public interface IRoomService extends IService<Room> {
    List<Room> selectbyhotelid(Hotel hotel);

    Room selectbyroomid(Room room);
}
