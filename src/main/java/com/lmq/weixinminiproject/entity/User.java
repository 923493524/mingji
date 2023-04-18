package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_user")
public class User implements Serializable {


    private Integer userId;
    private String nickname;
    private String userLevel;
    private String openid;
    private String userCreateTime;
    private String userUpdateTime;
}
