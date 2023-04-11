package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.models.auth.In;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_ordercontent")
public class OrderContent implements Serializable {

    private Integer ordercontentId;
    private String orderId;
    private Integer roomId;
    private Integer roomNumber;
    private Integer goodsId;
    private Integer goodsNumber;
}
