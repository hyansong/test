package com.magic.event;

import com.magic.test.MagicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class PushlishEvent {

    @Autowired
    private  ApplicationContext applicationContext;

    public void publish(MagicInfo magicInfo){
        applicationContext.publishEvent(new MagicEvent(this,magicInfo));
    }

}
