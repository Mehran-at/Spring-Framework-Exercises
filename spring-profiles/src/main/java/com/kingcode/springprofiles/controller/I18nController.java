package com.kingcode.springprofiles.controller;

import com.kingcode.springprofiles.service.GreetingEnglishService;
import com.kingcode.springprofiles.service.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("EN")
@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(GreetingEnglishService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
