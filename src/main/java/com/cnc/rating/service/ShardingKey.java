package com.cnc.rating.service;

import org.springframework.stereotype.Service;

@Service
public class ShardingKey {
    public int getShardDatabase(String key) {
        return key.charAt(key.length()-1) - '0';
    }
}
