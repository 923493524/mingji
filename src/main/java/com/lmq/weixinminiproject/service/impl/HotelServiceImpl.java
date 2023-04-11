package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.User;
import com.lmq.weixinminiproject.mapper.HotelMapper;
import com.lmq.weixinminiproject.service.IHotelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl extends ServiceImpl<HotelMapper, Hotel> implements IHotelService {
    @Override
    public List<Hotel> hotelallselect() {
        return this.getBaseMapper().hotelallselect();
    }

    @Override
    public Hotel selectbyhotelid(Hotel hotel) {
        return this.getBaseMapper().selectbyhotelid(hotel);
    }

    @Override
    public List<Hotel> selectbyinput(String input) {
        return this.getBaseMapper().selectbyinput(input);
    }
}
