package com.kingcode.springprofiles;

import com.kingcode.springprofiles.controller.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProfilesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringProfilesApplication.class, args);
        I18nController i18nController = (I18nController)ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
    }

}
