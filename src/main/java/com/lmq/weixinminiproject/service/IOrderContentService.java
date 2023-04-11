package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.Order;
import com.lmq.weixinminiproject.entity.OrderContent;

public interface IOrderContentService extends IService<OrderContent> {

    int insertordercontent(OrderContent orderContent);

    OrderContent selectbyorderid(String orderId);
}
