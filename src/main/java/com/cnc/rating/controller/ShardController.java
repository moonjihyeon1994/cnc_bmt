package com.cnc.rating.controller;

import com.cnc.rating.mybatis.RatingMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.cnc.rating.config.SpringProfile.SHARDING_SPHERE;

@Slf4j
@Profile({SHARDING_SPHERE})
@RequiredArgsConstructor
@RestController
public class ShardController {

    private final RatingMapper ratingMapper;
    HintManager hintManager = HintManager.getInstance();


    @GetMapping("/insertTest/{num}")
    public List<Map<String, Object>> insertTest(@PathVariable String num) {
        System.out.println("num = " + num);
        HashMap<String, Object> map = new HashMap<>();
        map.put("service_mgmt_no", num);
        ratingMapper.insertTest(map);
        return null;
    }

    @GetMapping("/selectTest/{num}")
    public List<HashMap<String, Object>> selectTest(@PathVariable String num) {
        System.out.println("num = " + num);
        Map<String, Object> map = new HashMap<>();
        hintManager.setDatabaseShardingValue(String.valueOf(Integer.parseInt(num) % 2));
        map.put("service_mgmt_no", num);
        return ratingMapper.selectTest(map);
    }
}
