package com.magic.controller;

import com.magic.base.BaseController;
import com.magic.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class TestRedisController extends BaseController {

    @Autowired
    private RedisService redisService;

    @GetMapping("addSet")
    public String addSet(String key, String value){
        redisService.addSet(key, value);
        return SUCCESS;
    }
}
