package com.magic.service;

import com.magic.bean.MagicUserInfo;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class Test extends AbstractMongoService{

    public Test(MongoTemplate mongoTemplate) {
        super(mongoTemplate);
    }


    public static void main(String[] args) {
        MagicUserInfo mui = new MagicUserInfo();
        mui.setAge(1);
        mui.setName("hys");
        try {
            toMap(mui);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }

}
