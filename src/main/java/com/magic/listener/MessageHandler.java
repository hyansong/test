//package com.magic.listener;
//
//import com.magic.bean.JT808KGpsData;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.kafka.clients.consumer.ConsumerRecord;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Slf4j
//@Component
//public class MessageHandler {
//
//    @KafkaListener(topics = "mykafka",id = "jt808_platform_ed_group")
//    public void getMessage(JT808KGpsData jt808KGpsData) {
//        log.info("进入");
//    }
//
//}
