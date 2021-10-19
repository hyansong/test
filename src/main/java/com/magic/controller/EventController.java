package com.magic.controller;

import com.magic.event.PushlishEvent;
import com.magic.test.MagicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private PushlishEvent pushlishEvent;

    @GetMapping("publish")
    public String publish(){
        MagicInfo magicInfo = new MagicInfo();
        magicInfo.setKey("shijian");
        magicInfo.setValue("2");
        magicInfo.setTime(123456l);
        pushlishEvent.publish(magicInfo);
        return "SUCCESS";
    }

}
