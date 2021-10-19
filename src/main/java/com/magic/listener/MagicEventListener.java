package com.magic.listener;

import com.magic.event.MagicEvent;
import com.magic.test.MagicInfo;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MagicEventListener {

    @EventListener
    public void handler(MagicEvent magicEvent){
        MagicInfo magicInfo = magicEvent.getMagicInfo();
        System.out.println("shijian --->" + magicInfo.getKey());
    }

}
