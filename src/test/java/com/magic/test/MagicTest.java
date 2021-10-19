package com.magic.test;

import com.magic.bean.JT808KGpsData;
import com.magic.bean.MagicUserInfo;
import com.magic.service.KafkaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = {MagicTest.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class MagicTest {

//    @Autowired
//    private KafkaService kafkaService;


    @Test
    public void product(){
//        JT808KGpsData gpsDataList = new JT808KGpsData();
//        gpsDataList.setBoxState(1);
//        gpsDataList.setDeviceId("deviceId");
//        gpsDataList.setLongitude("114.365");
//        gpsDataList.setLatitude("115.112");
//        gpsDataList.setPhoneNum("13520907821");
//        gpsDataList.setPulseSpeed(20);
//        gpsDataList.setLoadState(1);
//        gpsDataList.setPlateNumber("9685");
//        gpsDataList.setTime(System.currentTimeMillis()+"");
//        gpsDataList.setMerchantId("12");
//        gpsDataList.setTripId("236");
//        kafkaService.productMessage(gpsDataList);
    }

}
