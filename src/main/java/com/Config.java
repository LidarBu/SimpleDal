package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Autowired
    Environment environment;

    private final String DB_URL_KEY = "spring.datasource.url";
    private final String DB_DRIVER_KEY = "spring.datasource.driver-class-name";
    private final String DB_USERNAME_KEY = "spring.datasource.username";
    private final String DB_PASSWORD_KEY = "spring.datasource.password";

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url(environment.getProperty(DB_URL_KEY));
        dataSourceBuilder.driverClassName(environment.getProperty(DB_DRIVER_KEY));
        dataSourceBuilder.username(environment.getProperty(DB_USERNAME_KEY));
        dataSourceBuilder.password(environment.getProperty(DB_PASSWORD_KEY));
        return dataSourceBuilder.build();
    }

}
