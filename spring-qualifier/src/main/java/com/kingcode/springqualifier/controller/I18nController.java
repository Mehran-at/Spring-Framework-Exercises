package com.kingcode.springqualifier.controller;


import com.kingcode.springqualifier.service.GreetingEnglishService;
import com.kingcode.springqualifier.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("greetingEnglishService") GreetingEnglishService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
