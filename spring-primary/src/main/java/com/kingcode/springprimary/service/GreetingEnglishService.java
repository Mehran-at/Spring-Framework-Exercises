package com.kingcode.springprimary.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey there, how you doinn";
    }
}