package com.magic.event;

import com.magic.test.MagicInfo;
import org.springframework.context.ApplicationEvent;

public class MagicEvent extends ApplicationEvent {

    private MagicInfo magicInfo = null;

    public MagicEvent(Object source, MagicInfo magicInfo) {
        super(source);
        this.magicInfo = magicInfo;
    }

    public MagicInfo getMagicInfo(){
        return this.magicInfo;
    }
}
