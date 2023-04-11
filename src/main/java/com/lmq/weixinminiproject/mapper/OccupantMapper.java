package com.lmq.weixinminiproject.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmq.weixinminiproject.entity.Occupant;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface OccupantMapper extends BaseMapper<Occupant> {

    @Select("select * from h_occupant where user_id = #{userId}")
    List<Occupant> selectallbyuserid(Occupant occupant);

    @Select("select * from h_occupant where occupant_id = #{occupantId}")
    Occupant selectbyoccupantid(Occupant occupant);

    @Insert("insert into h_occupant(occupant_name,occupant_age,occupant_sex,occupant_tel,user_id) " +
            "value(#{occupantName},#{occupantAge},#{occupantSex},#{occupantTel},#{userId})")
    int insertoccupant(Occupant occupant);

    @Update("update h_occupant set occupant_name=#{occupantName},occupant_age=#{occupantAge}," +
            "occupant_sex=#{occupantSex},occupant_tel=#{occupantTel} where occupant_id = #{occupantId}")
    int updateoccupant(Occupant occupant);
    @Delete("delete from h_occupant where occupant_id = #{occupantId}")
    int deleteoccupant(Occupant occupant);
}
