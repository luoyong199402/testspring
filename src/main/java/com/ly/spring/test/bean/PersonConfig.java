package com.ly.spring.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {

    @Scope("prototype")
    @Bean(name = "person")
    public Person person1() {
        return new Person();
    }
}
