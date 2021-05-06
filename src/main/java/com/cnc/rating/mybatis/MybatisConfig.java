package com.cnc.rating.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Slf4j
@Configuration
public class MybatisConfig {

    private final DataSource client0DataSource;
    private final DataSource client1DataSource;
    private final DataSource client2DataSource;
    private final DataSource client3DataSource;
    private final DataSource client4DataSource;
    private final DataSource client5DataSource;
    private final DataSource client6DataSource;
    private final DataSource client7DataSource;
    private final DataSource client8DataSource;
    private final DataSource client9DataSource;

    public MybatisConfig(
            @Qualifier("client0DataSource") DataSource client0DataSource,
            @Qualifier("client1DataSource") DataSource client1DataSource,
            @Qualifier("client2DataSource") DataSource client2DataSource,
            @Qualifier("client3DataSource") DataSource client3DataSource,
            @Qualifier("client4DataSource") DataSource client4DataSource,
            @Qualifier("client5DataSource") DataSource client5DataSource,
            @Qualifier("client6DataSource") DataSource client6DataSource,
            @Qualifier("client7DataSource") DataSource client7DataSource,
            @Qualifier("client8DataSource") DataSource client8DataSource,
            @Qualifier("client9DataSource") DataSource client9DataSource
    ) {
        this.client0DataSource = client0DataSource;
        this.client1DataSource = client1DataSource;
        this.client2DataSource = client2DataSource;
        this.client3DataSource = client3DataSource;
        this.client4DataSource = client4DataSource;
        this.client5DataSource = client5DataSource;
        this.client6DataSource = client6DataSource;
        this.client7DataSource = client7DataSource;
        this.client8DataSource = client8DataSource;
        this.client9DataSource = client9DataSource;
    }

    @Primary
    @Bean
    public SqlSessionFactory client0SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client0DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client1SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client1DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client2SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client2DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client3SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client3DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client4SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client4DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client5SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client5DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client6SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client6DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client7SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client7DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client8SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client8DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client9SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client9DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Primary
    @Bean
    public SqlSessionTemplate client0SqlSessionTemplate(@Qualifier("client0SqlSessionFactory") SqlSessionFactory client0SqlSessionFactory) {
        log.info("create client0 template");
        return new SqlSessionTemplate(client0SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client1SqlSessionTemplate(@Qualifier("client1SqlSessionFactory") SqlSessionFactory client1SqlSessionFactory) {
        log.info("create client0 template");
        return new SqlSessionTemplate(client1SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client2SqlSessionTemplate(@Qualifier("client2SqlSessionFactory") SqlSessionFactory client2SqlSessionFactory) {
        return new SqlSessionTemplate(client2SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client3SqlSessionTemplate(@Qualifier("client3SqlSessionFactory") SqlSessionFactory client3SqlSessionFactory) {
        return new SqlSessionTemplate(client3SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client4SqlSessionTemplate(@Qualifier("client4SqlSessionFactory") SqlSessionFactory client4SqlSessionFactory) {
        return new SqlSessionTemplate(client4SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client5SqlSessionTemplate(@Qualifier("client5SqlSessionFactory") SqlSessionFactory client5SqlSessionFactory) {
        return new SqlSessionTemplate(client5SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client6SqlSessionTemplate(@Qualifier("client6SqlSessionFactory") SqlSessionFactory client6SqlSessionFactory) {
        return new SqlSessionTemplate(client6SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client7SqlSessionTemplate(@Qualifier("client7SqlSessionFactory") SqlSessionFactory client7SqlSessionFactory) {
        return new SqlSessionTemplate(client7SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client8SqlSessionTemplate(@Qualifier("client8SqlSessionFactory") SqlSessionFactory client8SqlSessionFactory) {
        return new SqlSessionTemplate(client8SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client9SqlSessionTemplate(@Qualifier("client9SqlSessionFactory") SqlSessionFactory client9SqlSessionFactory) {
        return new SqlSessionTemplate(client9SqlSessionFactory);
    }
}
