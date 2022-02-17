package com.kingcode.springjavaconfigurationbean.service;

import com.kingcode.springjavaconfigurationbean.repository.GreetingRepository;

public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }
}