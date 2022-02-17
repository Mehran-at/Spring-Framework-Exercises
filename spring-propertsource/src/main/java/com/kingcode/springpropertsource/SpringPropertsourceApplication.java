package com.kingcode.springpropertsource;

import com.kingcode.springpropertsource.config.AppCredentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPropertsourceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringPropertsourceApplication.class, args);
        AppCredentials appCredentials = ctx.getBean(AppCredentials.class);
        System.out.println(
            appCredentials.getUsername() + "\n" +
                appCredentials.getPassword() + "\n" +
                appCredentials.getJdbcUrl()
        );
    }
}