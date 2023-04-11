package com.lmq.weixinminiproject.controller;

import com.lmq.weixinminiproject.entity.OrderContent;
import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.service.IOrderContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ordercontent")
public class OrderContentController {

    @Autowired
    private IOrderContentService orderContentService;

    @RequestMapping("/insertordercontent")
    public Result insertordercontent(OrderContent orderContent){
        return Result.success(orderContentService.insertordercontent(orderContent));
    }

    @RequestMapping("/selectbyorderid")
    public Result selectbyorderid(String orderId){
        return Result.success(orderContentService.selectbyorderid(orderId),1);
    }




}
