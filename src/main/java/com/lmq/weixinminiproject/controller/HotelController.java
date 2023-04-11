package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.Hotel;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.service.IHotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private IHotelService hotelService;

    @RequestMapping("/selectall")
    public Result hotelallselect(){
        List<Hotel> hotelallselect = hotelService.hotelallselect();
        return Result.success(hotelallselect,1);
    }

    @RequestMapping("/selectbyhotelid")
    public Result selectbyhotelid(Hotel hotel){
        Hotel hotel1 = hotelService.selectbyhotelid(hotel);
        return Result.success(hotel1,1);
    }
    @RequestMapping("/selectbyinput")
    public  Result selectbyinput(String input){
        return Result.success(hotelService.selectbyinput(input),1);
    }

}
