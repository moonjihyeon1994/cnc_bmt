//package com.cnc.rating.config;
//
//import lombok.Getter;
//import lombok.Setter;
//import org.apache.shardingsphere.spi.masterslave.MasterSlaveLoadBalanceAlgorithm;
//
//import java.util.List;
//import java.util.Properties;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@Getter
//@Setter
//public final class RoundRobinMasterSlaveLoadBalanceAlgorithm implements MasterSlaveLoadBalanceAlgorithm {
//
//    private static final ConcurrentHashMap<String, AtomicInteger> COUNTS = new ConcurrentHashMap<>();
//
//    private Properties properties = new Properties();
//
//    @Override
//    public String getType() {
//        System.out.println("gdgdgdgdgdgd");
//        return "MOON";
//    }
//
//    @Override
//    public String getDataSource(String name, String masterDataSourceName, List<String> slaveDataSourceNames) {
//        AtomicInteger count = COUNTS.containsKey(name) ? COUNTS.get(name) : new AtomicInteger(0);
//        COUNTS.putIfAbsent(name, count);
//        System.out.println("gdgdgdgdgdgd");
//        count.compareAndSet(slaveDataSourceNames.size(), 0);
//        return slaveDataSourceNames.get(Math.abs(count.getAndIncrement()) % slaveDataSourceNames.size());
//    }
//}
