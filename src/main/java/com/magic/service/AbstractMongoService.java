package com.magic.service;

import com.google.common.collect.Maps;
import com.magic.bean.MagicUserInfo;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.lang.reflect.Field;
import java.util.Map;

abstract public class AbstractMongoService {

    private MongoTemplate mongoTemplate;

    public AbstractMongoService(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    public <T> T findOne(){

        return null;
    }

    public static Map<String, Object> toMap(Object obj) throws IllegalAccessException {
        Map<String, Object> param = Maps.newHashMap();
        if(obj == null){
            return null;
        }
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getFields();
//        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f:fields) {
            Object o = f.get(obj);
            System.out.println(o);

        }

        return null;
    }



}
