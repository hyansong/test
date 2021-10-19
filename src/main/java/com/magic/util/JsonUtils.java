package com.magic.util;

import com.alibaba.fastjson.JSONObject;
import com.magic.test.MagicInfo;

import java.util.ArrayList;
import java.util.List;

public class JsonUtils {

    public static String beanToString(Object o){
        if(o == null){
            return null;
        }
        return JSONObject.toJSONString(o);
    }

    public static <T> T toBean(String jsonStr, Class<T> clazz){
        if(jsonStr == null || jsonStr == ""){
            return null;
        }
        return  JSONObject.parseObject(jsonStr, clazz);
    }

    public static <T> List<T> toBeanList(String jsonStr, Class<T> clazz){
        return  JSONObject.parseArray(jsonStr, clazz);
    }

    public static void main(String[] args) {
        List<MagicInfo> mis = new ArrayList<>();
        MagicInfo mi = new MagicInfo();
        mi.setValue("1");
        mi.setKey("2");
        mis.add(mi);
        String s = beanToString(mis);
        System.out.println("字符串:" + s);
        List<MagicInfo> magicInfo = toBeanList(s, MagicInfo.class);
        System.out.println(magicInfo.toString());

    }
}
