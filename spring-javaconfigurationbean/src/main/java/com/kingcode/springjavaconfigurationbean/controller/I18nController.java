package com.kingcode.springjavaconfigurationbean.controller;

import com.kingcode.springjavaconfigurationbean.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class I18nController {
    private final GreetingRepository greetingRepository;

    public I18nController(@Qualifier("i18nService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String sayHello() {
        return greetingRepository.getGreeting();
    }
}
