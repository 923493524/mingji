package com.lmq.weixinminiproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmq.weixinminiproject.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public  interface IUserService extends IService<User> {

    User selectuserbyopenid(User user);

    int updateuser(User user);

    int insertuser(User user);







}
