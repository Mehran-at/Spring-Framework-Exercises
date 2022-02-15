package com.kingcode.springprofiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class GreetingEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey there, how you doinn";
    }
}