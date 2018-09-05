package com.xiaomi.cars.model;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2018/7/9.
 */
public class LayuiData extends HashMap<String,Object> {

    public static LayuiData successData(Integer count,List<?> data){
        LayuiData layuiData = new LayuiData();
        layuiData.put("code",0);
        layuiData.put("msg","请求成功");
        layuiData.put("count",count);
        layuiData.put("data",data);
        return layuiData;
    }


    public static LayuiData failData(String msg,Integer code){
        LayuiData layuiData = new LayuiData();
        layuiData.put("code",code);
        layuiData.put("msg",msg);
        layuiData.put("count",0);
        layuiData.put("data",null);
        return layuiData;
    }

}
