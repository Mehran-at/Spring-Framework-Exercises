package com.kingcode.springjavaconfigurationbean.config;

import com.kingcode.springjavaconfigurationbean.repository.EnglishGreetingRepositoryImpl;
import com.kingcode.springjavaconfigurationbean.repository.GreetingRepository;
import com.kingcode.springjavaconfigurationbean.repository.SpanishGreetingRepositoryImpl;
import com.kingcode.springjavaconfigurationbean.service.GreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GreetingServiceConfig {

    @Bean("i18nService")
    GreetingRepository greetingSpanishRepository() {
        return new SpanishGreetingRepositoryImpl();
    }

    @Primary
    @Bean("i18nService")
    GreetingRepository greetingEnglishRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    GreetingService sayGreeting(GreetingRepository greetingRepository) {
        return new GreetingService(greetingRepository);
    }
}