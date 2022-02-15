package com.kingcode.springprofiles.service;

import org.springframework.stereotype.Service;

@Service("i18nService")
public class GreetingEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey there, how you doinn";
    }
}