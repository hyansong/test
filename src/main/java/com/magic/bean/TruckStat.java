package com.magic.bean;

import java.io.Serializable;

public class TruckStat implements Serializable {

    private Integer load_stat;

    private Integer box_stat;

    public Integer getLoad_stat() {
        return load_stat;
    }

    public void setLoad_stat(Integer load_stat) {
        this.load_stat = load_stat;
    }

    public Integer getBox_stat() {
        return box_stat;
    }

    public void setBox_stat(Integer box_stat) {
        this.box_stat = box_stat;
    }
}
