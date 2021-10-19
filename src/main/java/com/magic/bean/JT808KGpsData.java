package com.magic.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class JT808KGpsData implements Serializable {

    private int altitude;

    private String version;

    private String alarm_all;

    private String state_all;

    private int fuel;

    private String location_state;

    private String vec3;
    private String vec2;
    /**
     * 行程id
     */
    private String tripId;

    /**
     * 设备 ID（IMEI号）
     */
    private String deviceId;

    /**
     * 设备所属商家Id
     */
    private String merchantId;

    /**
     * 设备车牌号
     */
    private String plate_number;

    private String phone_num;

    /**
     * GPS时间戳，单位毫 秒
     */
    private String time;

    /**
     * GPS 纬度
     */
    private String longtitude;

    /**
     * GPS 纬度
     */
    private String latitude;

    private Integer pulseSpeed;

    private Integer speed;

    private String userid;

    private Boolean supplement;

    private Integer locationState;

    /**
     * 举重状态 0=空载，1=重载
     */
    private Integer load_stat;

    /**
     * 举升状态  0=平放，1=举升
     */
    private Integer box_stat;

    private TruckStat truck_stat;

    /**
     * 车门状态
     */
    private DoorStateInfo state_info;
}
