package com.lmq.weixinminiproject.entity;

import lombok.Data;

/**
 * @Author ASUS
 * @Date 2023/3/8 16:00
 * @Version 1.0
 */
@Data
public class Result {
    private int code;
    private String msg;
    private Object data;
    private long count;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, Object data,long count) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.count=count;
    }

    //增删改
    public static Result success(int u){
        return  new Result(0,"success");
    }

    public static Result success(Object data,long count){
        return new Result(0,"success",data,count);
    }

    public static Result fail(){
        return new Result(1,"fail");
    }

}
