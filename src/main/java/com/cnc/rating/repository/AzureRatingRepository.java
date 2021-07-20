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
@Profile({AZURE, AZURE_DIRECT})
@Repository
public class AzureRatingRepository {

    private final SqlSessionTemplate clientSqlSessionTemplate;

    public AzureRatingRepository(SqlSessionTemplate clientSqlSessionTemplate) {
        this.clientSqlSessionTemplate = clientSqlSessionTemplate;
    }

    private final String namespace = "com.cnc.rating.mybatis.RatingMapper.";

    public List<HashMap<String, Object>> selectSub(HashMap<String, Object> params) {
        return clientSqlSessionTemplate.selectList(namespace + "selectSub", params);
    }

    public List<HashMap<String, Object>> selectOnlyService(HashMap<String, Object> params) {
        return clientSqlSessionTemplate.selectList(namespace + "selectOnlyService", params);
    }

}
