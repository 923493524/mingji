package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.Order;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.service.IOrderService;
import com.lmq.weixinminiproject.service.IRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Random;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IRoomService roomService;


    @ResponseBody
    @RequestMapping("/insertorder")
    public Result insertorder(Order order) {
        //生成订单号
        Calendar calendar = Calendar.getInstance();//创建对象
        String year = String.valueOf(calendar.get(Calendar.YEAR)); // 获取当前年
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);// 获取当前月
        String day = String.valueOf(calendar.get(Calendar.DATE));// 获取当前日
        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));// 获取当前小时
        String minute = String.valueOf(calendar.get(Calendar.MINUTE)); // 获取当前分钟
        String second = String.valueOf(calendar.get(Calendar.SECOND));// 获取当前秒
        String orderId = year+month+day+hour+minute+second;//拼接获取的信息
        int datelength = orderId.length();//获取当前长度
        int a = 16-datelength;//获取需要生成的随机数位数
        Random r = new Random();//创建对象
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < a; i++) {//生成对应位数的随机数
            rs.append(r.nextInt(9));
        }
        String random = rs.toString();
        orderId = orderId+random;//拼接订单号
        System.out.println("订单号："+orderId);
        order.setOrderId(orderId);//设置订单号
        orderService.insertorder(order);//调用接口生成订单并存进数据库
        String roomId = String.valueOf(order.getRoomId());
        roomService.subroomNumberbyroomid(roomId);
        return Result.success(orderId,1);//返回订单号回前端
    }

    @RequestMapping("/updatetypebyorderid")
    public Result updatetypebyorderid(String orderPrice,String orderType,String orderId,String roomId){
        if (!orderType.equals("待入住")){
            roomService.addroomNumberbyroomid(roomId);
        }
        return Result.success(orderService.updatetypebyorderid(orderPrice,orderType,orderId),1);
    }

    @RequestMapping("updatepricebyorderid")
    public Result updatepricebyorderid(String orderPrice,String endTime,String orderId){
        return Result.success(orderService.updatepricebyorderid(orderPrice,endTime,orderId),1);
    }

    @RequestMapping("/selectallbyuserid")
    public Result selectallbyuserid(Order order){
        return Result.success(orderService.selectallbyuserid(order),1);
    }

    @RequestMapping("/selectbyorderid")
    public Result selectbyorderid(String orderId){
        return Result.success(orderService.selectbyorderid(orderId),1);
    }

}
