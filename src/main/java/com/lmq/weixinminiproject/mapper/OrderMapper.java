package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.Order;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {
    @Insert("insert into h_order(order_id,user_id,hotel_id,hotel_name,room_id,room_name,room_number,order_price,order_paid,order_type,order_remarks,start_time,end_time,occupant_list,occupant_tel,occupant_time) " +
            "value(#{orderId},#{userId},#{hotelId},#{hotelName},#{roomId},#{roomName},#{roomNumber},#{orderPrice},#{orderPaid},#{orderType},#{orderRemarks},#{startTime},#{endTime},#{occupantList},#{occupantTel},#{occupantTime})")
    int insertorder(Order order);

    @Update("update h_order set order_type = #{orderType} where order_id = #{orderId}")
    int updatetypebyorderid(String orderType,String orderId);

    @Select("select * from h_order where user_id = #{userId}")
    List<Order> selectallbyuserid(Order order);

    @Select("select * from h_order where order_id = #{orderId}")
    Order selectbyorderid(String orderId);


}
