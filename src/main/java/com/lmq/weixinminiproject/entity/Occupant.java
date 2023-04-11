package com.lmq.weixinminiproject.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("h_occupant")
public class Occupant implements Serializable {
    private Integer occupantId;
    private Integer occupantAge;
    private Integer occupantSex;
    private String occupantName;
    private String occupantTel;
    private String userId;
    private String occupantCreateTime;
    private String occupantUpdateTime;
}
