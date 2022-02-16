package com.kingcode.springdefaultprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("i18nService")
public class GreetingSpanishService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hola mamacita";
    }
}