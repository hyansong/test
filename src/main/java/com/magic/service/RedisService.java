package com.magic.service;

import com.alibaba.fastjson.JSONObject;
import com.magic.test.MagicInfo;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {

//    @Autowired
//    private RedissonClient redisson;
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void addSet(String key, String value){
        redisTemplate.opsForSet().add(key, value);
    }

    public  Object hget(String key, String field){
        return redisTemplate.opsForHash().get(key, field);
    }

    public  void hset(String key, String field){
        MagicInfo magicInfo = new MagicInfo();
        magicInfo.setKey("1");
        magicInfo.setTime(System.currentTimeMillis());
        magicInfo.setValue("测试");
        redisTemplate.opsForHash().put(key, field, JSONObject.toJSONString(magicInfo));
    }

    public void publish(){
//        RTopic ceshi = redisson.getTopic("ceshi", new SerializationCodec());
//        MagicInfo magicInfo = new MagicInfo();
//        magicInfo.setKey("1");
//        magicInfo.setTime(System.currentTimeMillis());
//        magicInfo.setValue("测试");
//        long publish = ceshi.publish(magicInfo);
//        System.out.println(publish);
    }




}
