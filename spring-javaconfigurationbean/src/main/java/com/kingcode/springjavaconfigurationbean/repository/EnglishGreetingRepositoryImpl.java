package com.kingcode.springjavaconfigurationbean.repository;

public class EnglishGreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getGreeting() {
        return "Hey there, how you doinn";
    }
}