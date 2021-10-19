package com.magic.test;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Function;
import com.google.common.collect.Maps;
import com.magic.test.MagicInfo;
import com.magic.util.JsonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ObjectUtils;

import java.time.Instant;
import java.util.*;

@Slf4j
public class MagicMain {

    public static Map<String, MagicMain> map = new HashMap<>();

    public static void main(String[] args) {
//        MagicInfo magicInfo = null;
//        System.out.println(ObjectUtils.isEmpty(magicInfo));
//        Map<String, List<MagicInfo>> m = new HashMap<String, List<MagicInfo>>();
//        test(m);
//        System.out.println(m);

//        List<MagicInfo> list = list();
//        list.sort(Comparator.comparingLong((m->m.getTime())));
//        for (MagicInfo m:list) {
//            System.out.println(m.toString());
//        }
//        String a = "1";
//        MagicMain mm = new MagicMain();
//        mm.mapPut();
//        System.out.println(1);

//        Map<String, String> map = Maps.newHashMap();
//        map.put("a","1");
//
//        System.out.println(map.get("a"));

//        MagicInfo mi = new MagicInfo();
//        mi.setKey("1");
//        mi.setValue("1");
//        Map<String, Object> map = Maps.newHashMap();
//        map.put("a", JsonUtils.beanToString(null));
//
//        Object a = map.getOrDefault("a", "");
//        System.out.println(JsonUtils.toBean(a.toString(), MagicInfo.class));


//        Integer a = null;
//        Integer b = 1;
//        System.out.println(a == b);
//        String a = "\"1634113448257\"";
//        log.info(a.replaceAll("\"", ""));
//        String pa = "1:2:3:4:5:6";
//        log.info("数据: {}", "1");
//        String intercept = interceptBefornFornSymbol(pa, 2, ":");
//        String intercept = interceptAfternFornSymbol(pa, 0, ":");
//        log.info("数据:{}", intercept);
        System.out.println(Instant.now().getEpochSecond());
    }

    /**
     *
     * @param str  源字符串
     * @param n  第n个字符
     * @param symbol 字符
     * @return
     */
    public static String interceptBefornFornSymbol(String str, int n, String symbol){
        int start = 1;
        String[] split = str.split(symbol);
        final StringBuilder sb = new StringBuilder();
        for(String d : split){
            if(start > n)
                return sb.toString();
            sb.append(d);
            start ++;
        }
        return sb.toString();
    }

    /**
     *
     * @param str  源字符串
     * @param n  第n个字符
     * @param symbol 字符
     * @return
     */
    public static String interceptAfternFornSymbol(String str, int n, String symbol){
        int start = 1;
        String[] split = str.split(symbol);
        final StringBuilder sb = new StringBuilder();
        for(String d : split){
            if(start > n)
                sb.append(d);
            start ++;
        }
        return sb.toString();
    }

    public void mapPut(){
        map.put(this.getClass().getSimpleName().replaceFirst("Magic", ""), this);
    }

    public static  void test(Map<String, List<MagicInfo>> m){
        MagicInfo magicInfo = new MagicInfo();
        magicInfo.setKey("a");
        magicInfo.setValue("112");
//        MagicInfo magicInfo = null;
        Optional<MagicInfo> op = Optional.ofNullable(magicInfo);
        op.ifPresent(u->{
            List<MagicInfo> enptyList = m.getOrDefault(u.getKey(), new ArrayList<>());
            if(enptyList.size() == 0){
                m.put(u.getKey(), enptyList);
            }
            enptyList.add(u);
        });
    }

    public static List<MagicInfo> list(){
        List<MagicInfo> l = new ArrayList<>();
        l.add(new MagicInfo("1","1'", 1632456721584l));
        try {
            Thread.sleep(100);
        }catch (Exception e){

        }

        l.add(new MagicInfo("2","2'", 1632456721472l));

        try {
            Thread.sleep(100);
        }catch (Exception e){

        }

        l.add(new MagicInfo("3","3'", 1632456721694l));

        return l;
    }
}
