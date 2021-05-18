package com.cnc.rating.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Profile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cnc.rating.config.SpringProfile.SHARDING_SPHERE;

@Profile({SHARDING_SPHERE})
@Mapper
public interface RatingMapper {
    List<HashMap<String, Object>> selectTest(Map<String, Object> parameters);
    void insertTest(HashMap<String, Object> parameters);
}
