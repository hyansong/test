package com.magic.test;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.omg.Messaging.SyncScopeHelper;

import java.util.HashMap;
import java.util.Map;

public class TestMagic {
    public final static Integer TEST_A = 1;
    public static void main(String[] args) {

        Map<String, Object> m = new HashMap<String, Object>();
        m.put("a",null);
        System.out.println((Integer) (m.get("a" )!=null?m.get("a" ):0));
//        System.out.println((Integer) m.get("a") == TEST_A.intValue());
    }
}
