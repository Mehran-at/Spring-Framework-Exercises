package com.kingcode.springconfigurationproperties;

import com.kingcode.springconfigurationproperties.config.AppCredentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConfigurationpropertiesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringConfigurationpropertiesApplication.class, args);
        AppCredentials appCredentials = ctx.getBean(AppCredentials.class);
        System.out.println(
            appCredentials.getUsername() + "\n" +
                appCredentials.getPassword() + "\n" +
                appCredentials.getJdbcUrl()
        );
    }
}