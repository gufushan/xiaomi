package com.xiaomi.cars.model;

import java.util.Date;

/**
 * Created by Administrator on 2018/7/6.
 */
public class User {

    /**
     * 用户ID 系统自动生成
     */
    public String user_id;

    /**
     * 用户姓名
     */
    public String user_name;

    /**
     *  用户手机号码
     */
    public String user_phone;
    /**
     *    用户等级 依据充值金额
     */
    public String level;
    /**
     *    用户状态 0为正常 1为删除
     */
    public Integer user_state;
    /**
     *     用户开卡时间
     */
    public Date create_time;


    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", level='" + level + '\'' +
                ", user_state=" + user_state +
                ", create_time='" + create_time + '\'' +
                '}';
    }

    public User(String user_id, String user_name, String user_phone, String level, Integer user_state, Date create_time) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.level = level;
        this.user_state = user_state;
        this.create_time = create_time;
    }

    public User() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getUser_state() {
        return user_state;
    }

    public void setUser_state(Integer user_state) {
        this.user_state = user_state;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
