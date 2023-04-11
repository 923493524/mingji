package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.Order;


import java.util.List;

public interface IOrderService extends IService<Order> {

    int insertorder(Order order);

    int updatetypebyorderid(String orderType,String orderId);//更新订单状态

    List<Order> selectallbyuserid(Order order);

    Order selectbyorderid(String orderId);



}
