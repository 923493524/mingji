package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_room")
public class Room implements Serializable {
    private Integer roomId;
    private String roomName;
    private Integer roomPrice;
    private Integer roomNumber;
    private Integer roomRemainNumber;
    private Integer roomInHotelId;
    private String roomInHotelName;
    private String roomCreateTime;
    private String roomUpdateTime;
    private String roomProfile;
    private String roomPic;

}
