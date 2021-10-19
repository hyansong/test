package com.magic.handler;

import com.magic.util.MarkDeal;

import java.util.HashMap;
import java.util.Map;

public class DealFactory {
    private static Map<Integer, ICommonDeal> commonDealMap = new HashMap<>();

    public static void addDeal(ICommonDeal iCommonDeal){
        int type = iCommonDeal.getClass().getAnnotation(MarkDeal.class).type();
        commonDealMap.put(type, iCommonDeal);
    }

    public static ICommonDeal get(Integer type){
        return commonDealMap.get(type);
    }

}
