package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.User;
import org.apache.ibatis.annotations.*;




public interface UserMapper extends BaseMapper<User> {

    @Select("select * from h_user where openid = #{openid}")
    User selectuserbyopenid(User user);

    @Update("update h_user set nickname=#{nickname},avatarurl=#{avatarurl} where openid = #{openid}")
    int updateuser(User user);

    @Insert("insert into h_user(nickname,openid) value(#{nickname},#{openid})")
    int inseruser(User user);






}
