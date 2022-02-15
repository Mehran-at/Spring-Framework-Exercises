package com.kingcode.springqualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("greetingEnglishService")
public class GreetingEnglishService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hey there, how you doinn";
    }
}