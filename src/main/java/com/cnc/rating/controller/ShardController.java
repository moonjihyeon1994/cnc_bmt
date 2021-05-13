package com.cnc.rating.controller;

import com.cnc.rating.mybatis.RatingMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/test")
    public List<Map<String, Object>> test() {
        System.out.println("--------");
        return ratingMapper.selectTest();
    }
}
