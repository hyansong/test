package com.magic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 车门各车门开门状态(关门=0， 开门=1)
 */
@Data
public class DoorStateInfo {

    /**
     * 前门
     */
    @JSONField(name = "door_13")
    private Integer door_13;

    /**
     * 中门
     */
    @JSONField(name = "door_14")
    private Integer door_14;

    /**
     * 后门
     */
    @JSONField(name = "door_15")
    private Integer door_15;

    /**
     * 驾驶席门
     */
    @JSONField(name = "door_16")
    private Integer door_16;

    /**
     * 自定义
     */
    @JSONField(name = "door_17")
    private Integer door_17;
}
