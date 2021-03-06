package com.kingcode.springqualifier.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("greetingSpanishService")
public class GreetingSpanishService implements GreetingService{
    @Override
    public String sayHello() {
        return "Hola mamacita";
    }
}
