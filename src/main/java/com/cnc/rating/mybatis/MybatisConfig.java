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
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

import static com.cnc.rating.config.SpringProfile.*;

@Slf4j
@Profile({DEV, TEST, PROD})
@Configuration
public class MybatisConfig {

    private final DataSource client1DataSource;
    private final DataSource client2DataSource;
    private final DataSource client3DataSource;
    private final DataSource client4DataSource;
    private final DataSource client5DataSource;
    private final DataSource client6DataSource;
    private final DataSource client7DataSource;
    private final DataSource client8DataSource;
    private final DataSource client9DataSource;
    private final DataSource client10DataSource;
    private final DataSource client11DataSource;
    private final DataSource client12DataSource;
    private final DataSource client13DataSource;
    private final DataSource client14DataSource;
    private final DataSource client15DataSource;
    private final DataSource client16DataSource;
    private final DataSource client17DataSource;
    private final DataSource client18DataSource;
    private final DataSource client19DataSource;
    private final DataSource client20DataSource;

    public MybatisConfig(
            @Qualifier("client1DataSource") DataSource client1DataSource,
            @Qualifier("client2DataSource") DataSource client2DataSource,
            @Qualifier("client3DataSource") DataSource client3DataSource,
            @Qualifier("client4DataSource") DataSource client4DataSource,
            @Qualifier("client5DataSource") DataSource client5DataSource,
            @Qualifier("client6DataSource") DataSource client6DataSource,
            @Qualifier("client7DataSource") DataSource client7DataSource,
            @Qualifier("client8DataSource") DataSource client8DataSource,
            @Qualifier("client9DataSource") DataSource client9DataSource,
            @Qualifier("client10DataSource") DataSource client10DataSource,
            @Qualifier("client11DataSource") DataSource client11DataSource,
            @Qualifier("client12DataSource") DataSource client12DataSource,
            @Qualifier("client13DataSource") DataSource client13DataSource,
            @Qualifier("client14DataSource") DataSource client14DataSource,
            @Qualifier("client15DataSource") DataSource client15DataSource,
            @Qualifier("client16DataSource") DataSource client16DataSource,
            @Qualifier("client17DataSource") DataSource client17DataSource,
            @Qualifier("client18DataSource") DataSource client18DataSource,
            @Qualifier("client19DataSource") DataSource client19DataSource,
            @Qualifier("client20DataSource") DataSource client20DataSource
    ) {
        this.client1DataSource = client1DataSource;
        this.client2DataSource = client2DataSource;
        this.client3DataSource = client3DataSource;
        this.client4DataSource = client4DataSource;
        this.client5DataSource = client5DataSource;
        this.client6DataSource = client6DataSource;
        this.client7DataSource = client7DataSource;
        this.client8DataSource = client8DataSource;
        this.client9DataSource = client9DataSource;
        this.client10DataSource = client10DataSource;
        this.client11DataSource = client11DataSource;
        this.client12DataSource = client12DataSource;
        this.client13DataSource = client13DataSource;
        this.client14DataSource = client14DataSource;
        this.client15DataSource = client15DataSource;
        this.client16DataSource = client16DataSource;
        this.client17DataSource = client17DataSource;
        this.client18DataSource = client18DataSource;
        this.client19DataSource = client19DataSource;
        this.client20DataSource = client20DataSource;
    }

    @Primary
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

    @Bean
    public SqlSessionFactory client10SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client10DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client11SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client11DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client12SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client12DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client13SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client13DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client14SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client14DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client15SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client15DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client16SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client16DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client17SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client17DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client18SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client18DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client19SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client19DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Bean
    public SqlSessionFactory client20SqlSessionFactory(ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setDataSource(client20DataSource);
        sqlSession.setConfigLocation(applicationContext.getResource("classpath:/mapper/mybatis-config.xml"));
        sqlSession.setMapperLocations(applicationContext.getResources("classpath:/mapper/*Mapper.xml"));
        return sqlSession.getObject();
    }

    @Primary
    @Bean
    public SqlSessionTemplate client1SqlSessionTemplate(@Qualifier("client1SqlSessionFactory") SqlSessionFactory client1SqlSessionFactory) {
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

    @Bean
    public SqlSessionTemplate client10SqlSessionTemplate(@Qualifier("client10SqlSessionFactory") SqlSessionFactory client10SqlSessionFactory) {
        return new SqlSessionTemplate(client10SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client11SqlSessionTemplate(@Qualifier("client11SqlSessionFactory") SqlSessionFactory client11SqlSessionFactory) {
        return new SqlSessionTemplate(client11SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client12SqlSessionTemplate(@Qualifier("client12SqlSessionFactory") SqlSessionFactory client12SqlSessionFactory) {
        return new SqlSessionTemplate(client12SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client13SqlSessionTemplate(@Qualifier("client13SqlSessionFactory") SqlSessionFactory client13SqlSessionFactory) {
        return new SqlSessionTemplate(client13SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client14SqlSessionTemplate(@Qualifier("client14SqlSessionFactory") SqlSessionFactory client14SqlSessionFactory) {
        return new SqlSessionTemplate(client14SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client15SqlSessionTemplate(@Qualifier("client15SqlSessionFactory") SqlSessionFactory client15SqlSessionFactory) {
        return new SqlSessionTemplate(client15SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client16SqlSessionTemplate(@Qualifier("client16SqlSessionFactory") SqlSessionFactory client16SqlSessionFactory) {
        return new SqlSessionTemplate(client16SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client17SqlSessionTemplate(@Qualifier("client17SqlSessionFactory") SqlSessionFactory client17SqlSessionFactory) {
        return new SqlSessionTemplate(client17SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client18SqlSessionTemplate(@Qualifier("client18SqlSessionFactory") SqlSessionFactory client18SqlSessionFactory) {
        return new SqlSessionTemplate(client18SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client19SqlSessionTemplate(@Qualifier("client19SqlSessionFactory") SqlSessionFactory client19SqlSessionFactory) {
        return new SqlSessionTemplate(client19SqlSessionFactory);
    }

    @Bean
    public SqlSessionTemplate client20SqlSessionTemplate(@Qualifier("client20SqlSessionFactory") SqlSessionFactory client20SqlSessionFactory) {
        return new SqlSessionTemplate(client20SqlSessionFactory);
    }
}
