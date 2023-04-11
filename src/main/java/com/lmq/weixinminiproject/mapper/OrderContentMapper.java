package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.OrderContent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface OrderContentMapper extends BaseMapper<OrderContent> {

    @Insert("insert into h_ordercontent(order_id,room_id,room_number,goods_id,goods_number) " +
            "value(#{orderId},#{roomId},#{roomNumber},#{goodsId},#{goodsNumber})")
    int insertordercontent(OrderContent orderContent);

    @Select("select * from h_ordercontent where order_id = #{orderId}")
    OrderContent selectbyorderid(String orderId);
}
