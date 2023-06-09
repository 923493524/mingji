package com.lmq.weixinminiproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@EnableScheduling
@MapperScan("com.lmq.weixinminiproject.mapper")
public class WeixinminiprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeixinminiprojectApplication.class, args);
    }

}
