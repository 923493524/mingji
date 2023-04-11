package com.lmq.weixinminiproject.controller;


import com.lmq.weixinminiproject.entity.Result;
import com.lmq.weixinminiproject.entity.User;

import com.lmq.weixinminiproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;


import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;
import java.util.Random;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @RequestMapping("/selectuserbyopenid")
    public Result selectuserbyopenid(User user){
        return Result.success(userService.selectuserbyopenid(user),1);
    }

    @RequestMapping("/updateuser")
    public Result updateuser(User user){
        return Result.success(userService.updateuser(user),1);
    }

    @RequestMapping("/insertuser")
    public Result insertuser(User user){
        String str = "微信用户";
        //创建对象
        Calendar calendar = Calendar.getInstance();
        // 获取当前年
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        // 获取当前月
        String month = String.valueOf(calendar.get(Calendar.MONTH) + 1);
        // 获取当前日
        String day = String.valueOf(calendar.get(Calendar.DATE));
        String date = year+month+day;
        //创建对象
        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        int a = 10-date.length();
        //生成对应位数的随机数
        for (int i = 0; i < a; i++) {
            rs.append(r.nextInt(9));
        }
        String random = rs.toString();
        str = str+date+random;
        user.setNickname(str);
        userService.insertuser(user);
        return Result.success(userService.selectuserbyopenid(user),1);
    }






    @ResponseBody
    @RequestMapping(value = "/getopenid")
    public Result getOpenid(@RequestParam(value = "code", required = false) String code) {

        //向微信后台发起请求获取openid的url
        String WX_URL = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";

        //替换appid，appsecret，和code
        String requestUrl =
                WX_URL.replace("APPID", "wx6e3f7e8e66103b37").
                        replace("SECRET", "741bf56bd0d39b03810a0ccedd33caff").
                        replace("JSCODE", code).
                        replace("authorization_code", "authorization_code");
        //调用get方法发起get请求，并把返回值赋值给returnvalue
        String returnvalue = GET(requestUrl);
        //定义一个json对象。将得到的字符串转换为json
        JSONObject convertvalue = (JSONObject) JSON.parse(returnvalue);
        //打印得到的openid
        System.out.println("return openid is ：" + (String) convertvalue.get("openid"));
        //把openid赋值给openid
        String openid = (String) convertvalue.get("openid");
        return Result.success(openid,1);//返回openid
    }
    //发起ge请求---生成openid和session_key
    public String GET(String url) {
        String result = "";
        BufferedReader in = null;
        InputStream is = null;
        InputStreamReader isr = null;
        try {
            //构造url对象
            URL realUrl = new URL(url);
            //获取一个对应该URL的URLConnection对象
            URLConnection conn = realUrl.openConnection();
            conn.connect();
            is = conn.getInputStream();
            isr = new InputStreamReader(is);
            in = new BufferedReader(isr);
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("异常出现");
        }
        //关闭资源
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (is != null) {
                    is.close();
                }
                if (isr != null) {
                    isr.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("出现异常");
            }
        }
        return result;
    }
}
