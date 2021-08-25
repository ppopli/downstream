//package com.example.downstream.config;
//
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EntityScan(basePackages = {"com.pulkit.requesttracer.datasource.entity"})
//@EnableJpaRepositories(basePackages = "com.pulkit.requesttracer.datasource.repository.master")
//public class LoggingMasterDBConfig {
//
//    @Bean
//    @ConfigurationProperties("master.logging.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//}
