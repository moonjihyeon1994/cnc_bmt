package com.cnc.rating.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cnc.rating.config.SpringProfile.AZURE;
import static com.cnc.rating.config.SpringProfile.AZURE_DIRECT;

@Profile({AZURE, AZURE_DIRECT})
@Mapper
public interface PostgresMapper {
//    List<HashMap<String, Object>> selectTest(Map<String, Object> parameters);
//
//    void insertTest(HashMap<String, Object> parameters);

    List<HashMap<String, Object>> selectSub(HashMap<String, Object> params);

    List<HashMap<String, Object>> test();
}
