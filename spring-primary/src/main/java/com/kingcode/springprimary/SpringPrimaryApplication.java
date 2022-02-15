package com.kingcode.springprimary;

import com.kingcode.springprimary.controller.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPrimaryApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringPrimaryApplication.class, args);
        I18nController i18nController = (I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
    }

}
