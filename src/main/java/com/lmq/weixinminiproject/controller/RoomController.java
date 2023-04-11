package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.entity.Room;
import com.lmq.weixinminiproject.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private IRoomService roomService;

    @RequestMapping("/selectbyhotelid")
    public Result selectbyhotelid(Hotel hotel){
        List<Room> roomList = roomService.selectbyhotelid(hotel);
        return Result.success(roomList,1);
    }

    @RequestMapping("/selectbyroomid")
    public Result selectbyroomid(Room room){
        Room room1 = roomService.selectbyroomid(room);
        return Result.success(room1,1);
    }
}
