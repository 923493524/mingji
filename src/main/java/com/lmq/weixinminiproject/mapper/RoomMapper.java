package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.Room;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface RoomMapper extends BaseMapper<Room> {

    @Select("select * from h_room where room_in_hotel_id = #{hotelId}")
    List<Room> selectbyhotelid(Hotel hotel);

    @Select("select * from h_room where room_id = #{roomId}")
    Room selectbyroomid(Room room);

    @Update("UPDATE h_room set room_remain_number = room_remain_number + 1 where room_id = #{roomId}")
    int addroomNumberbyroomid(String roomId);

    @Update("UPDATE h_room set room_remain_number = room_remain_number - 1 where room_id = #{roomId}")
    int subroomNumberbyroomid(String roomId);
}
