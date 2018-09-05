package com.xiaomi.cars.controller;

import com.xiaomi.cars.configuration.WebSecurityConfig;
import com.xiaomi.cars.model.LayuiData;
import com.xiaomi.cars.model.User;
import com.xiaomi.cars.service.UserManager;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by Administrator on 2018/7/6.
 */
@Controller
public class IndexController {

    @Autowired
    public UserManager userManager;

    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(String username, String password, HttpSession session){
        if (username != null && password != null){
            if ("admin".equals(username) && "xiaomi123".equals(password)){
                session.setAttribute(WebSecurityConfig.SESSION_KEY,username);
                return "OK";
            }
        }
        return "用户名或密码错误";
    }

    @RequestMapping(value = "/admin/index")
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/admin/welcome")
    public String toWelcome(){
        return "welcome";
    }


    @RequestMapping(value = "/user/member/list",method = RequestMethod.GET)
    public String toUserMemberList(){
        return "member-list";
    }

    @RequestMapping(value = "/user/member/add",method = RequestMethod.GET)
    public String toUserMemberAdd(){
        return "member-add";
    }

    @RequestMapping(value = "/music",method = RequestMethod.GET)
    public String toMusic(){
        return "music";
    }



    @RequestMapping(value = "/user/member/add",method = RequestMethod.POST)
    @ResponseBody
    public String addMember(String user_id,String username,String telephone,Integer account){
        User user  = new User(user_id,username,telephone,"A",0,new Date());
        userManager.createMember(user);
        return "OK";
    }


    @RequestMapping(value = "/user/logout",method = RequestMethod.GET)
    public String UserLoginOut(HttpSession session){
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "login";
    }



    @RequestMapping(value = "/user/test/uidata",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> testUiData(@RequestParam Map<String,Object> param){
        List<User> users = null;
        if (param.get("user_id") != null){
            users = new ArrayList<>();
            users.add(userManager.findUserById(param.get("user_id").toString()));
        }else {
            users = userManager.listAllMember();
        }
        return LayuiData.successData(users.size(),users);
    }

}
