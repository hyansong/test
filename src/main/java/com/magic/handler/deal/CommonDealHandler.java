package com.magic.handler.deal;

import com.magic.handler.ICommonDeal;
import com.magic.util.MarkDeal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@MarkDeal(type = 1)
public class CommonDealHandler implements ICommonDeal {
    @Override
    public void execute() {
        log.info("进入:{}", "CommonDealHandler");
    }
}
