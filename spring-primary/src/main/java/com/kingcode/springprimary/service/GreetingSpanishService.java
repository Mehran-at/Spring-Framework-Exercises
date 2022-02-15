package com.kingcode.springprimary.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingSpanishService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hola mamacita";
    }
}
