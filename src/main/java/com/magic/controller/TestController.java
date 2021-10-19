package com.magic.controller;

import com.alibaba.fastjson.JSONObject;
import com.magic.bean.DoorStateInfo;
import com.magic.bean.JT808KGpsData;
import com.magic.bean.MagicUserInfo;
import com.magic.bean.TruckStat;
import com.magic.service.KafkaService;
import com.magic.service.MongoService;
import com.magic.service.RedisService;
import com.magic.test.MagicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private MongoService mongoService;

    @Autowired
    private KafkaService kafkaService;

    @Autowired
    private RedisService redisService;

    @GetMapping("hget")
    public MagicInfo hget(String key, String field){
        Object hget = redisService.hget(key, field);
        return JSONObject.parseObject(hget.toString(), MagicInfo.class);
    }

    @GetMapping("hset")
    public String hset(String key, String field){
        redisService.hset(key, field);
        return "SUCCESS";
    }

    @GetMapping("red")
    public String testRed(){
        redisService.publish();
        return "SUCCESS";
    }

    @GetMapping("product")
    public String test(String deviceId, String tripId, Integer boxStat, Integer loadStat, String latitude, String longtitude){
        JT808KGpsData gpsDataList = new JT808KGpsData();
        gpsDataList.setDeviceId(deviceId);
        gpsDataList.setLatitude(latitude);
        gpsDataList.setLongtitude(longtitude);
        gpsDataList.setPhone_num("13522222222");
        gpsDataList.setPulseSpeed(10);
        gpsDataList.setPlate_number("测A26339");
        gpsDataList.setTime(Instant.now().getEpochSecond()+"");
        gpsDataList.setMerchantId("testSu");
        gpsDataList.setUserid("000");
        gpsDataList.setTripId(tripId);
        gpsDataList.setSupplement(false);
//        gpsDataList.setAlarm_all();
        gpsDataList.setState_all("000c0003");
        gpsDataList.setFuel(0);
        gpsDataList.setAltitude(172);
        TruckStat truckStat = new TruckStat();
        truckStat.setBox_stat(boxStat);
        truckStat.setLoad_stat(loadStat);
        gpsDataList.setTruck_stat(truckStat);

//        DoorStateInfo dsi = new DoorStateInfo();
//        dsi.setDoor_13(1);
//        gpsDataList.setState_info(dsi);
        kafkaService.productMessage(gpsDataList);
        return "SUCCESS";
    }

    @GetMapping("test")
    public String test(MagicUserInfo mui){
        mongoService.addData(mui);
        return "SUCCESS";
    }

    @GetMapping("queryOne")
    public MagicUserInfo getData(String name){
        return mongoService.query(name);
    }

    @GetMapping("queryList")
    public List<MagicUserInfo> getDataList(MagicUserInfo magicUserInfo){
        return mongoService.queryList(magicUserInfo);
    }

    @GetMapping("pageList")
    public List<MagicUserInfo> pageList(){
        return null;
    }
}
