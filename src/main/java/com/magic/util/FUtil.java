package com.magic.util;

import com.magic.test.MagicInfo;

public class FUtil {

    public static <T> T getBean(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        T t = tClass.newInstance();
        return t;
    }

    public static void main(String[] args) throws Exception{
        MagicInfo bean = FUtil.getBean(MagicInfo.class);
        System.out.println(bean.getKey());
    }

}
