package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_order")
public class Order implements Serializable {

    private String orderId;
    private Integer userId;
    private Integer hotelId;
    private String hotelName;
    private Integer roomId;
    private Integer roomNumber;
    private String roomName;
    private Integer orderPrice;
    private Integer orderPaid;
    private String orderType;
    private String orderRemarks;
    private String orderCreateTime;
    private String orderUpdateTime;
    private String startTime;
    private String endTime;
    private String occupantList;
    private String occupantTel;
    private String occupantTime;
}
