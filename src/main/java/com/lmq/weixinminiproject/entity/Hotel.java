package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_hotel")
public class Hotel implements Serializable {

    private Integer hotelId;
    private String hotelName;
    private String hotelAddress;
    private String hotelTel;
    private String hotelPerson;
    private String hotelPic;
    private String hotelCreateTime;
    private String hotelUpdateTime;
    private String sheng;
    private String shi;
    private String qu;

}
