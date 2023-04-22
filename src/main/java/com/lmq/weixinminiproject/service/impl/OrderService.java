package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.Order;

import com.lmq.weixinminiproject.mapper.OrderMapper;
import com.lmq.weixinminiproject.service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService extends ServiceImpl<OrderMapper, Order> implements IOrderService {
    @Override
    public int insertorder(Order order) {
        return this.getBaseMapper().insert(order);
    }

    @Override
    public int updatetypebyorderid(String orderType,String orderId) {
        return this.getBaseMapper().updatetypebyorderid(orderType,orderId);
    }

    @Override
    public List<Order> selectallbyuserid(Order order) {
        return this.getBaseMapper().selectallbyuserid(order);
    }

    @Override
    public Order selectbyorderid(String orderId) {
        return this.getBaseMapper().selectbyorderid(orderId);
    }
}
