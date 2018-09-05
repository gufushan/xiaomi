package com.xiaomi.cars.service.impl;

import com.xiaomi.cars.service.LoginService;
import org.springframework.util.StringUtils;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2018/7/6.
 */
public class LoginServiceImpl implements LoginService {


    @Override
    public String adminLoginValid(String username, String password) {
        if (!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){


        }else {
            return "用户名或密码错误";
        }
        return null;
    }
}
