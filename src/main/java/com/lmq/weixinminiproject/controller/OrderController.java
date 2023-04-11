package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.Order;
import com.lmq.weixinminiproject.entity.OrderContent;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.service.IOrderContentService;
import com.lmq.weixinminiproject.service.IOrderService;
import org.mockito.internal.matchers.Or;
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
    private IOrderContentService orderContentService;

    @ResponseBody
    @RequestMapping("/insertorder")
    public Result insertorder(Order order, OrderContent orderContent) {
        //创建对象
        Calendar calendar = Calendar.getInstance();
        // 获取当前年
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        // 获取当前月
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        // 获取当前日
        String day = String.valueOf(calendar.get(Calendar.DATE));
        // 获取当前小时
        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        // 获取当前分钟
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        // 获取当前秒
        String second = String.valueOf(calendar.get(Calendar.SECOND));
        //拼接获取的信息
        String orderId = year+month+day+hour+minute+second;
        //获取当前长度
        int datelength = orderId.length();
        //获取需要生成的随机数位数
        int a = 16-datelength;
        //创建对象
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        //生成对应位数的随机数
        for (int i = 0; i < a; i++) {
            rs.append(r.nextInt(9));
        }
        String random = rs.toString();
        //拼接
        orderId = orderId+random;
        System.out.println("订单号："+orderId);

        order.setOrderId(orderId);
        orderContent.setOrderId(orderId);
        orderService.insertorder(order);
        orderContentService.insertordercontent(orderContent);
        return Result.success(orderId,1);
    }

    @RequestMapping("/updatetypebyorderid")
    public Result updatetypebyorderid(String orderType,String orderId){
        return Result.success(orderService.updatetypebyorderid(orderType,orderId),1);
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
