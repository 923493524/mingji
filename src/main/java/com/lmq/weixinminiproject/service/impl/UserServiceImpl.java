package com.lmq.weixinminiproject.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmq.weixinminiproject.entity.User;
import com.lmq.weixinminiproject.mapper.UserMapper;
import com.lmq.weixinminiproject.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User selectuserbyopenid(User user) {
        return this.getBaseMapper().selectuserbyopenid(user);
    }

    @Override
    public int updateuser(User user) {
        return this.getBaseMapper().updateuser(user);
    }

    @Override
    public int insertuser(User user) {
        return this.getBaseMapper().inseruser(user);
    }
}
