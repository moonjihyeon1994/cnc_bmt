//package com.cnc.rating.mybatis;
//
//import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
//import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//
//import java.util.Collection;
//
//import static com.cnc.rating.config.SpringProfile.SHARDING_SPHERE;
//
//@Profile({SHARDING_SPHERE})
//@Component
//public class AuroraPreciseAlgorithm implements PreciseShardingAlgorithm<String> {
//
//    @Override
//    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<String> shardingValue) {
//        int shardNumber = getShardNumber(shardingValue.getValue());
//        System.out.println("select database name " + shardingValue.getValue());
//        switch (shardNumber) {
//            case 0:
//                return "client0";
//            case 1:
//                return "client1";
//            default:
//                throw new RuntimeException();
//        }
//    }
//
//    private int getShardNumber(String key) {
//        return key.charAt(key.length() - 1) - '0';
//    }
//}
