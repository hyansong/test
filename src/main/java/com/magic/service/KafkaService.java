package com.magic.service;

import com.alibaba.fastjson.JSONObject;
import com.magic.bean.JT808KGpsData;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void productMessage(JT808KGpsData gpsDataList){
        log.info("上传的数据为: {}", JSONObject.toJSONString(gpsDataList));
        kafkaTemplate.send("jt808_data_gps", JSONObject.toJSONString(gpsDataList));
    }
}
