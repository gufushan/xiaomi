package com.xiaomi.cars.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Administrator on 2018/7/11.
 */
@Controller
public class BuriedPoint {


    @RequestMapping(value = "/buriedPoint/data",method = RequestMethod.POST)
    @ResponseBody
    public String buriedPointRead(@RequestParam Map<String,Object> param){

        JSONObject jsonObject = JSONObject.parseObject(param.get("data").toString());
        System.out.print("opcode:\""+jsonObject.get("opcode")+"\",");
        System.out.print("code:"+jsonObject.get("code")+",");
        System.out.print("curl:\""+jsonObject.get("curl")+"\",");
        System.out.print("rurl:\""+jsonObject.get("rurl")+"\",");
        System.out.print("cityCode:\""+jsonObject.get("cityCode")+"\",");
        System.out.print("guid:\""+jsonObject.get("guid")+"\",");
        System.out.print("dynamicParam:\""+jsonObject.get("dynamicParam")+",");
        System.out.print("time:"+param.get("time")+",");
        System.out.println("term:"+param.get("source"));
        return "1";
    }
}
