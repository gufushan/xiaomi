package com.xiaomi.cars.dao.impl;

import com.xiaomi.cars.dao.MemberDao;
import com.xiaomi.cars.mapper.MemberMapper;
import com.xiaomi.cars.model.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/7/10.
 * @author FuShan
 */
@Repository
public class MemberDaoImpl implements MemberDao {

    @Resource
    private MemberMapper memberMapper;

    @Override
    public void addMember(User user) {
        System.out.println(user);
        memberMapper.addMember(user);
    }

    @Override
    public void deleteMember(User user) {

    }

    @Override
    public void updateMember(User user) {

    }

    @Override
    public List<User> findAllMember() {
        return memberMapper.findAllMember();
    }

    @Override
    public User findUserById(String user_id) {
        return memberMapper.findMemberById(user_id);
    }
}
