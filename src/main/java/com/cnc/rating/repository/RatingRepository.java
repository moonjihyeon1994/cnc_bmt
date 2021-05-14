package com.cnc.rating.repository;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@Repository
public class RatingRepository {

    private final SqlSessionTemplate client1SqlSessionTemplate;
    private final SqlSessionTemplate client2SqlSessionTemplate;
    private final SqlSessionTemplate client3SqlSessionTemplate;
    private final SqlSessionTemplate client4SqlSessionTemplate;
    private final SqlSessionTemplate client5SqlSessionTemplate;
    private final SqlSessionTemplate client6SqlSessionTemplate;
    private final SqlSessionTemplate client7SqlSessionTemplate;
    private final SqlSessionTemplate client8SqlSessionTemplate;
    private final SqlSessionTemplate client9SqlSessionTemplate;
    private final SqlSessionTemplate client10SqlSessionTemplate;
    private final SqlSessionTemplate client11SqlSessionTemplate;
    private final SqlSessionTemplate client12SqlSessionTemplate;
    private final SqlSessionTemplate client13SqlSessionTemplate;
    private final SqlSessionTemplate client14SqlSessionTemplate;
    private final SqlSessionTemplate client15SqlSessionTemplate;
    private final SqlSessionTemplate client16SqlSessionTemplate;
    private final SqlSessionTemplate client17SqlSessionTemplate;
    private final SqlSessionTemplate client18SqlSessionTemplate;
    private final SqlSessionTemplate client19SqlSessionTemplate;
    private final SqlSessionTemplate client20SqlSessionTemplate;

    public RatingRepository(
            @Qualifier("client1SqlSessionTemplate") SqlSessionTemplate client1SqlSessionTemplate,
            @Qualifier("client2SqlSessionTemplate") SqlSessionTemplate client2SqlSessionTemplate,
            @Qualifier("client3SqlSessionTemplate") SqlSessionTemplate client3SqlSessionTemplate,
            @Qualifier("client4SqlSessionTemplate") SqlSessionTemplate client4SqlSessionTemplate,
            @Qualifier("client5SqlSessionTemplate") SqlSessionTemplate client5SqlSessionTemplate,
            @Qualifier("client6SqlSessionTemplate") SqlSessionTemplate client6SqlSessionTemplate,
            @Qualifier("client7SqlSessionTemplate") SqlSessionTemplate client7SqlSessionTemplate,
            @Qualifier("client8SqlSessionTemplate") SqlSessionTemplate client8SqlSessionTemplate,
            @Qualifier("client9SqlSessionTemplate") SqlSessionTemplate client9SqlSessionTemplate,
            @Qualifier("client10SqlSessionTemplate") SqlSessionTemplate client10SqlSessionTemplate,
            @Qualifier("client11SqlSessionTemplate") SqlSessionTemplate client11SqlSessionTemplate,
            @Qualifier("client12SqlSessionTemplate") SqlSessionTemplate client12SqlSessionTemplate,
            @Qualifier("client13SqlSessionTemplate") SqlSessionTemplate client13SqlSessionTemplate,
            @Qualifier("client14SqlSessionTemplate") SqlSessionTemplate client14SqlSessionTemplate,
            @Qualifier("client15SqlSessionTemplate") SqlSessionTemplate client15SqlSessionTemplate,
            @Qualifier("client16SqlSessionTemplate") SqlSessionTemplate client16SqlSessionTemplate,
            @Qualifier("client17SqlSessionTemplate") SqlSessionTemplate client17SqlSessionTemplate,
            @Qualifier("client18SqlSessionTemplate") SqlSessionTemplate client18SqlSessionTemplate,
            @Qualifier("client19SqlSessionTemplate") SqlSessionTemplate client19SqlSessionTemplate,
            @Qualifier("client20SqlSessionTemplate") SqlSessionTemplate client20SqlSessionTemplate
    ) {
        this.client1SqlSessionTemplate = client1SqlSessionTemplate;
        this.client2SqlSessionTemplate = client2SqlSessionTemplate;
        this.client3SqlSessionTemplate = client3SqlSessionTemplate;
        this.client4SqlSessionTemplate = client4SqlSessionTemplate;
        this.client5SqlSessionTemplate = client5SqlSessionTemplate;
        this.client6SqlSessionTemplate = client6SqlSessionTemplate;
        this.client7SqlSessionTemplate = client7SqlSessionTemplate;
        this.client8SqlSessionTemplate = client8SqlSessionTemplate;
        this.client9SqlSessionTemplate = client9SqlSessionTemplate;
        this.client10SqlSessionTemplate = client10SqlSessionTemplate;
        this.client11SqlSessionTemplate = client11SqlSessionTemplate;
        this.client12SqlSessionTemplate = client12SqlSessionTemplate;
        this.client13SqlSessionTemplate = client13SqlSessionTemplate;
        this.client14SqlSessionTemplate = client14SqlSessionTemplate;
        this.client15SqlSessionTemplate = client15SqlSessionTemplate;
        this.client16SqlSessionTemplate = client16SqlSessionTemplate;
        this.client17SqlSessionTemplate = client17SqlSessionTemplate;
        this.client18SqlSessionTemplate = client18SqlSessionTemplate;
        this.client19SqlSessionTemplate = client19SqlSessionTemplate;
        this.client20SqlSessionTemplate = client20SqlSessionTemplate;
    }

    private final String namespace = "com.cnc.rating.mybatis.RatingMapper.";

    public List<HashMap<String, Object>> selectSub(int shardNumber, HashMap<String, Object> params) {
        return getSqlSessionTemplateByShardNumber(shardNumber).selectList(namespace + "selectSub", params);
    }

    private SqlSessionTemplate getSqlSessionTemplateByShardNumber(int shardNumber) {
//        return client19SqlSessionTemplate;
//        /*
        switch (shardNumber) {
            case 1:
                return client1SqlSessionTemplate;
            case 2:
                return client2SqlSessionTemplate;
            case 3:
                return client3SqlSessionTemplate;
            case 4:
                return client4SqlSessionTemplate;
            case 5:
                return client5SqlSessionTemplate;
            case 6:
                return client6SqlSessionTemplate;
            case 7:
                return client7SqlSessionTemplate;
            case 8:
                return client8SqlSessionTemplate;
            case 9:
                return client9SqlSessionTemplate;
            case 10:
                return client10SqlSessionTemplate;
            case 11:
                return client11SqlSessionTemplate;
            case 12:
                return client12SqlSessionTemplate;
            case 13:
                return client13SqlSessionTemplate;
            case 14:
                return client14SqlSessionTemplate;
            case 15:
                return client15SqlSessionTemplate;
            case 16:
                return client16SqlSessionTemplate;
            case 17:
                return client17SqlSessionTemplate;
            case 18:
                return client18SqlSessionTemplate;
            case 19:
                return client19SqlSessionTemplate;
            case 20:
                return client2SqlSessionTemplate;
            default:
                throw new RuntimeException();
        }
//        */
    }
}
