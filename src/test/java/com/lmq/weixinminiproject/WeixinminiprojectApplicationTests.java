package com.lmq.weixinminiproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.Random;

@SpringBootTest
class WeixinminiprojectApplicationTests {

    @Test
    void contextLoads() {


    }

    @Test
    public static void main(String[] args) {
        //创建对象
        Calendar calendar = Calendar.getInstance();
        // 获取当前年
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        // 获取当前月
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        // 获取当前日
        String day = String.valueOf(calendar.get(Calendar.DATE));
        // 获取当前小时
        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        // 获取当前分钟
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        // 获取当前秒
        String second = String.valueOf(calendar.get(Calendar.SECOND));
        //拼接获取的信息
        String orderId = year+month+day+hour+minute+second;
        //获取当前长度
        int datelength = orderId.length();
        //获取需要生成的随机数位数
        int a = 16-datelength;
        //创建对象
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        //生成对应位数的随机数
        for (int i = 0; i < a; i++) {
            rs.append(r.nextInt(9));
        }
        String random = rs.toString();
        //拼接
        orderId = orderId+random;
        System.out.println("订单号："+orderId);
    }

}
