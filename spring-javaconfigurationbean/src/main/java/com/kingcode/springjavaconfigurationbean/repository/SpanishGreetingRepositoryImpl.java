package com.kingcode.springjavaconfigurationbean.repository;

public class SpanishGreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGreeting() {
        return "Hola mamacita";
    }
}