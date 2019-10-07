package com.ly.spring.test.tx;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
public class TxBeanConfig {

    @Bean
    public DataSource dataSource() {
        HikariConfig hikariConfig = new HikariDataSource();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://106.54.225.37:3306/test?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("Admin123!");

        return new HikariDataSource(hikariConfig);
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
