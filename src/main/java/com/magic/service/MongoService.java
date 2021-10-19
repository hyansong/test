package com.magic.service;

import com.magic.base.BaseInput;
import com.magic.bean.MagicUserInfo;
import com.magic.bean.abs.DataProvider;
import com.magic.test.MagicInfo;
import com.mongodb.client.result.UpdateResult;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.core.ExecutableUpdateOperation;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class MongoService extends DataProvider {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addData(MagicUserInfo mui){
        log.info("测试: {}, 这个是{}", "你好啊", "测试结尾");


        mongoTemplate.insert(mui);
    }

    public void addDataList(){
        mongoTemplate.insert(magicUserInfos, MagicUserInfo.class);
    }

    public void delete(String name, Integer age){
        Query qry = new Query(Criteria.where("name").is(name).and("age").is(age));
        mongoTemplate.remove(qry, MagicUserInfo.class);
    }

    public MagicUserInfo  query(String name){
        Query query = new Query(Criteria.where("name").is(name));

        return mongoTemplate.findOne(query, MagicUserInfo.class);
    }

    public List<MagicUserInfo> queryList(MagicUserInfo magicUserInfo){
        Query query = new Query(Criteria.where("name").is(magicUserInfo.getName()).and("age").is(magicUserInfo.getAge()));

        return mongoTemplate.find(query, MagicUserInfo.class);
    }

    public void updateData(MagicUserInfo magicUserInfo){
        Query query = new Query(Criteria.where("name").is(magicUserInfo.getName()));
        Update up = new Update().set("age", magicUserInfo.getAge());
        mongoTemplate.updateFirst(query, up, MagicUserInfo.class);
    }

    public Page<MagicUserInfo> pageList(BaseInput baseInput){
        Sort sort = new Sort(Sort.Direction.DESC, "age");
        Pageable pageable = PageRequest.of(baseInput.getCurrentPage()-1, baseInput.getPageSize(), sort);
        Query q = new Query();
//        Criteria criteria = Criteria.where("name").is(baseInput.getName());
        Criteria criteria = new Criteria();
        criteria.and("age").is(2);
        criteria.andOperator(Criteria.where("age").gte(1), Criteria.where("age").lte(4));
        q.addCriteria(criteria);
        long count = mongoTemplate.count(q, MagicUserInfo.class);
        List<MagicUserInfo> magicUserInfos = mongoTemplate.find(q.with(pageable), MagicUserInfo.class);
        return new PageImpl<MagicUserInfo>(magicUserInfos, pageable, count);
    }
}
