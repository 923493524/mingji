package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.User;

import java.util.List;

public interface IHotelService extends IService<Hotel> {

    List<Hotel> hotelallselect();

    Hotel selectbyhotelid(Hotel hotel);

    List<Hotel> selectbyinput(String input);
}
