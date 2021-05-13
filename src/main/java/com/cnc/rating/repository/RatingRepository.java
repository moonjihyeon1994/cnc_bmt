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

    private final SqlSessionTemplate client0SqlSessionTemplate;
    private final SqlSessionTemplate client1SqlSessionTemplate;
    private final SqlSessionTemplate client2SqlSessionTemplate;
    private final SqlSessionTemplate client3SqlSessionTemplate;
    private final SqlSessionTemplate client4SqlSessionTemplate;
    private final SqlSessionTemplate client5SqlSessionTemplate;
    private final SqlSessionTemplate client6SqlSessionTemplate;
    private final SqlSessionTemplate client7SqlSessionTemplate;
    private final SqlSessionTemplate client8SqlSessionTemplate;
    private final SqlSessionTemplate client9SqlSessionTemplate;

    public RatingRepository(
            @Qualifier("client0SqlSessionTemplate") SqlSessionTemplate client0SqlSessionTemplate,
            @Qualifier("client1SqlSessionTemplate") SqlSessionTemplate client1SqlSessionTemplate,
            @Qualifier("client2SqlSessionTemplate") SqlSessionTemplate client2SqlSessionTemplate,
            @Qualifier("client3SqlSessionTemplate") SqlSessionTemplate client3SqlSessionTemplate,
            @Qualifier("client4SqlSessionTemplate") SqlSessionTemplate client4SqlSessionTemplate,
            @Qualifier("client5SqlSessionTemplate") SqlSessionTemplate client5SqlSessionTemplate,
            @Qualifier("client6SqlSessionTemplate") SqlSessionTemplate client6SqlSessionTemplate,
            @Qualifier("client7SqlSessionTemplate") SqlSessionTemplate client7SqlSessionTemplate,
            @Qualifier("client8SqlSessionTemplate") SqlSessionTemplate client8SqlSessionTemplate,
            @Qualifier("client9SqlSessionTemplate") SqlSessionTemplate client9SqlSessionTemplate
    ) {
        this.client0SqlSessionTemplate = client0SqlSessionTemplate;
        this.client1SqlSessionTemplate = client1SqlSessionTemplate;
        this.client2SqlSessionTemplate = client2SqlSessionTemplate;
        this.client3SqlSessionTemplate = client3SqlSessionTemplate;
        this.client4SqlSessionTemplate = client4SqlSessionTemplate;
        this.client5SqlSessionTemplate = client5SqlSessionTemplate;
        this.client6SqlSessionTemplate = client6SqlSessionTemplate;
        this.client7SqlSessionTemplate = client7SqlSessionTemplate;
        this.client8SqlSessionTemplate = client8SqlSessionTemplate;
        this.client9SqlSessionTemplate = client9SqlSessionTemplate;
    }

    private final String namespace = "com.cnc.rating.mybatis.RatingMapper.";

    public List<HashMap<String, Object>> selectCDR(String service_mgmt_no, int shardNumber, String startDate, String endDate) {
        return getSqlSessionTemplateByShardNumber(shardNumber).selectList(namespace + "selectCDR", service_mgmt_no);
    }

    public List<HashMap<String, Object>> selectSub(int shardNumber, HashMap<String, Object> params) {
        return getSqlSessionTemplateByShardNumber(shardNumber).selectList(namespace + "selectSub", params);
    }

    public List<HashMap<String, Object>> selectTest(int shardNumber) {
        return getSqlSessionTemplateByShardNumber(shardNumber).selectList(namespace + "selectTest");
    }

    private SqlSessionTemplate getSqlSessionTemplateByShardNumber(int shardNumber) {
        switch (shardNumber) {
            case 0:
                return client1SqlSessionTemplate;
            case 1:
                return client1SqlSessionTemplate;
            case 2:
                return client1SqlSessionTemplate;
            case 3:
                return client1SqlSessionTemplate;
            case 4:
                return client1SqlSessionTemplate;
            case 5:
                return client1SqlSessionTemplate;
            case 6:
                return client1SqlSessionTemplate;
            case 7:
                return client1SqlSessionTemplate;
            case 8:
                return client1SqlSessionTemplate;
            case 9:
                return client1SqlSessionTemplate;
            default:
                throw new RuntimeException();
        }
    }
}
