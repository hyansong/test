package com.magic.controller;

import com.magic.base.BaseController;
import com.magic.base.BaseInput;
import com.magic.bean.MagicUserInfo;
import com.magic.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mongoTest")
public class TestMongoController extends BaseController {

    @Autowired
    private MongoService mongoService;

    @GetMapping("delete")
    public String delete(String name, Integer age){
        mongoService.delete(name, age);
        return SUCCESS;
    }

    @GetMapping("addInfo")
    public String addInfo(MagicUserInfo magicUserInfo){
        mongoService.addData(magicUserInfo);
        return SUCCESS;
    }

    @GetMapping("queryDataList")
    public List<MagicUserInfo> queryDataList(MagicUserInfo magicUserInfo){

        return mongoService.queryList(magicUserInfo);
    }

    @GetMapping("addDataList")
    public String addDataList(){
        mongoService.addDataList();
        return SUCCESS;
    }

    @GetMapping("updateAge")
    public String updateDataAge(MagicUserInfo magicUserInfo){
        mongoService.updateData(magicUserInfo);
        return SUCCESS;
    }

    @GetMapping("pageList")
    public  Page<MagicUserInfo> pageList(BaseInput baseInput){
        Page<MagicUserInfo> magicUserInfos = mongoService.pageList(baseInput);
        return magicUserInfos;
    }
}
