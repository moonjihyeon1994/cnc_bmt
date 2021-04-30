package com.cnc.rating.repository;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class PostRepo {

    private final SqlSessionTemplate client1SqlSessionTemplate;
    private final SqlSessionTemplate client2SqlSessionTemplate;
//    private final SqlSessionTemplate client3SqlSessionTemplate;
//    private final SqlSessionTemplate client4SqlSessionTemplate;
//    private final SqlSessionTemplate client5SqlSessionTemplate;
//    private final SqlSessionTemplate client6SqlSessionTemplate;
//    private final SqlSessionTemplate client7SqlSessionTemplate;
//    private final SqlSessionTemplate client8SqlSessionTemplate;
//    private final SqlSessionTemplate client9SqlSessionTemplate;
//    private final SqlSessionTemplate client10SqlSessionTemplate;


    public PostRepo(
            @Qualifier("client1SqlSessionTemplate") SqlSessionTemplate client1SqlSessionTemplate,
            @Qualifier("client2SqlSessionTemplate") SqlSessionTemplate client2SqlSessionTemplate
//            @Qualifier("client3SqlSessionTemplate") SqlSessionTemplate client3SqlSessionTemplate,
//            @Qualifier("client4SqlSessionTemplate") SqlSessionTemplate client4SqlSessionTemplate,
//            @Qualifier("client5SqlSessionTemplate") SqlSessionTemplate client5SqlSessionTemplate,
//            @Qualifier("client6SqlSessionTemplate") SqlSessionTemplate client6SqlSessionTemplate,
//            @Qualifier("client7SqlSessionTemplate") SqlSessionTemplate client7SqlSessionTemplate,
//            @Qualifier("client8SqlSessionTemplate") SqlSessionTemplate client8SqlSessionTemplate,
//            @Qualifier("client9SqlSessionTemplate") SqlSessionTemplate client9SqlSessionTemplate,
//            @Qualifier("client10SqlSessionTemplate") SqlSessionTemplate client10SqlSessionTemplate
    ) {
        this.client1SqlSessionTemplate = client1SqlSessionTemplate;
        this.client2SqlSessionTemplate = client2SqlSessionTemplate;
//        this.client3SqlSessionTemplate = client3SqlSessionTemplate;
//        this.client4SqlSessionTemplate = client4SqlSessionTemplate;
//        this.client5SqlSessionTemplate = client5SqlSessionTemplate;
//        this.client6SqlSessionTemplate = client6SqlSessionTemplate;
//        this.client7SqlSessionTemplate = client7SqlSessionTemplate;
//        this.client8SqlSessionTemplate = client8SqlSessionTemplate;
//        this.client9SqlSessionTemplate = client9SqlSessionTemplate;
//        this.client10SqlSessionTemplate = client10SqlSessionTemplate;
    }

    private final String namespace = "com.cnc.rating.mybatis.PostMapper.";

    public List<HashMap<String, Object>> getAllPost_Client1() {
        return client1SqlSessionTemplate.selectList(namespace + "selectAll");
    }

    public List<HashMap<String, Object>> getAllPost_Client2() {
        return client2SqlSessionTemplate.selectList(namespace + "selectAll");
    }

}
