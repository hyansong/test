package com.magic.test;

import java.io.Serializable;

public class MagicInfo implements Serializable {
    private String key;
    private String value;
    private long time;

    public MagicInfo() {
    }

    public MagicInfo(String key, String value, long time) {
        this.key = key;
        this.value = value;
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MagicInfo{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", time=" + time +
                '}';
    }
}
