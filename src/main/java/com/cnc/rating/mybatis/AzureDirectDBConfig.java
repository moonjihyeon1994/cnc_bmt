package com.cnc.rating.mybatis;

import com.cnc.rating.config.ClientDataSourceRouter;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

import static com.cnc.rating.config.SpringProfile.AZURE_DIRECT;

@Slf4j
@Profile({AZURE_DIRECT})
@MapperScan(value = "com.cnc.rating.mybatis.PostgresMapper")
@Configuration
public class AzureDirectDBConfig {

    String prefixUrl = "jdbc:postgresql://";
    String suffixUrl = ".bss-bmt-kc-urt-postgresql.postgres.database.azure.com:5432/citus";

    @Bean
    public DataSource RouterDataSource() {
        Map<Object, Object> targetSources = new HashMap<>();
        for (int i = 0; i < 80; i++) {
            targetSources.put("w" + i, getDataSource(prefixUrl + "w" + i + suffixUrl));
        }
        ClientDataSourceRouter clientDataSourceRouter = new ClientDataSourceRouter();
        clientDataSourceRouter.setTargetDataSources(targetSources);
        return clientDataSourceRouter;
    }

    private DataSource getDataSource(String url) {
        com.zaxxer.hikari.HikariDataSource dataSource = new com.zaxxer.hikari.HikariDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setJdbcUrl(url);
        dataSource.setUsername("bmtstat3");
        dataSource.setPassword("djqjdlskf12!");
        return dataSource;
    }
}
