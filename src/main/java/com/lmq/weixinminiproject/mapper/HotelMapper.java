package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.Hotel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HotelMapper extends BaseMapper<Hotel> {

    @Select("select * from h_hotel")
    List<Hotel> hotelallselect();

    @Select("select * from h_hotel where hotel_id=#{hotelId}")
    Hotel selectbyhotelid(Hotel hotel);

    @Select("select * from h_hotel where hotel_name like concat('%',#{input},'%')")
    List<Hotel> selectbyinput(String input);


}
