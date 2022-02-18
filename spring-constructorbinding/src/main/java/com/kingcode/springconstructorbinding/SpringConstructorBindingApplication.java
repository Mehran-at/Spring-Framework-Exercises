package com.kingcode.springconstructorbinding;

import com.kingcode.springconstructorbinding.config.DataCredentialsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConstructorBindingApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringConstructorBindingApplication.class, args);
        DataCredentialsConfig constructorConfig = ctx.getBean(DataCredentialsConfig.class);
        System.out.println(
            constructorConfig.getUsername() + "\n" +
                constructorConfig.getPassword() + "\n" +
                constructorConfig.getJdbcUrl()
        );
    }
}