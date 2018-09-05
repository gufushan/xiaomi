package com.xiaomi.cars.dao;

import com.xiaomi.cars.model.User;

import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 */
public interface MemberDao {
    void addMember(User user);
    void deleteMember(User user);
    void updateMember(User user);
    List<User> findAllMember();
    User findUserById(String user_id);
}
