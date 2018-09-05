package com.xiaomi.cars.mapper;

import com.xiaomi.cars.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 */
@Mapper
public interface MemberMapper {

    @Select("select user_id,user_name,user_phone,level,user_state,create_time from web_user where user_id = #{user_id}")
    User findMemberById(@Param("user_id") String user_id);

    @Select("select user_id,user_name,user_phone,level,user_state,create_time from web_user")
    List<User> findAllMember();

    @Insert("insert into web_user (user_id,user_name,user_phone,level,user_state,create_time) value " +
            "(#{user.user_id},#{user.user_name},#{user.user_phone},#{user.level},#{user.user_state},#{user.create_time})")
    void addMember(@Param("user") User user);
}
