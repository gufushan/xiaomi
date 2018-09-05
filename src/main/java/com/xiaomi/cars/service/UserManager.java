package com.xiaomi.cars.service;

import com.xiaomi.cars.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/7/9.
 */
public interface UserManager {

    Integer createMember(User user);

    Integer deleteMember(String user_id);

    Integer updateMemeber(User user);

    List<User> listAllMember();

    User findUserById(String userid);

}
