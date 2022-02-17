package com.kingcode.springpropertsource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    AppCredentials appCredentials(@Value("${dbUsername}") String username,
                                  @Value("${dbPassword}") String password,
                                  @Value("${dbUrl}") String jdbcUrl) {
        AppCredentials appCredentials = new AppCredentials();
        appCredentials.setUsername(username);
        appCredentials.setPassword(password);
        appCredentials.setJdbcUrl(jdbcUrl);
        return appCredentials;
    }
}