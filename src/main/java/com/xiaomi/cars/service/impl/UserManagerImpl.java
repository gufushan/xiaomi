package com.xiaomi.cars.service.impl;

import com.xiaomi.cars.dao.MemberDao;
import com.xiaomi.cars.model.User;
import com.xiaomi.cars.service.UserManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/7/9.
 */
@Service
public class UserManagerImpl implements UserManager {

    @Resource
    private MemberDao memberDao;

    @Override
    public Integer createMember(User user) {
        if (user != null && user.getUser_id() !=null){
            User userById = findUserById(user.getUser_id());
            if (userById == null){
                memberDao.addMember(user);
                return 0;
            }
        }
        return 1;

    }

    @Override
    public Integer deleteMember(String user_id) {
        return null;
    }

    @Override
    public Integer updateMemeber(User user) {
        return null;
    }

    @Override
    public List<User> listAllMember() {
        List<User> allMember = memberDao.findAllMember();
        return allMember;
    }

    @Override
    public User findUserById(String userid) {
        return memberDao.findUserById(userid);
    }
}
