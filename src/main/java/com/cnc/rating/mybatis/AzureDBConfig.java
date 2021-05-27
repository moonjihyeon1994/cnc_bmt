package com.cnc.rating.mybatis;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

import static com.cnc.rating.config.SpringProfile.AZURE;

@Slf4j
@Profile({AZURE})
@Configuration
public class AzureDBConfig {

    @Bean
    @ConfigurationProperties("app.datasource.client")
    public DataSource clientDataSource() {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Bean
    public SqlSessionFactory clientSqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(clientDataSource());
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/postgresMapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionTemplate client1SqlSessionTemplate(SqlSessionFactory clientSqlSessionFactory) {
        return new SqlSessionTemplate(clientSqlSessionFactory);
    }
}
