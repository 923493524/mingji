package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.OrderContent;
import com.lmq.weixinminiproject.mapper.OrderContentMapper;
import com.lmq.weixinminiproject.service.IOrderContentService;
import org.springframework.stereotype.Service;

@Service
public class OrdercontentService extends ServiceImpl<OrderContentMapper, OrderContent> implements IOrderContentService {

    @Override
    public int insertordercontent(OrderContent orderContent) {
        return this.getBaseMapper().insertordercontent(orderContent);
    }

    @Override
    public OrderContent selectbyorderid(String orderId) {
        return this.getBaseMapper().selectbyorderid(orderId);
    }
}
