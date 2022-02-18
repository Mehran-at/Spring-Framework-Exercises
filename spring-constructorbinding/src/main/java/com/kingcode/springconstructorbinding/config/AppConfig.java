package com.kingcode.springconstructorbinding.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DataCredentialsConfig.class)
public class AppConfig {
}