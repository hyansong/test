package com.magic.bean.abs;

import com.magic.bean.MagicUserInfo;

import java.util.ArrayList;
import java.util.List;

abstract public class DataProvider {

    public List<MagicUserInfo> magicUserInfos = new ArrayList<>();

    public DataProvider(){
        this.createagicUserInfos();
    }

    public void createagicUserInfos(){
        for(int a = 1; a <= 5; a ++){
            magicUserInfos.add(new MagicUserInfo("hys"+a, a));
        }
    }
}
