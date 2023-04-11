package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_user")
public class User implements Serializable {


    private Integer userId;
    private String nickname;
    private String userName;
    private String avatarurl;
    private String userSex;
    private String userPhone;
    private String userIdNumber;
    private String userIdType;
    private String userAge;
    private String userLevel;
    private String userCredit;
    private String openid;
    private String userCreateTime;
    private String userUpdateTime;
}
