package com.ly.spring.test.exetend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class TestBeanCreate {

    @Bean(initMethod = "init", destroyMethod = "destory")
    public Xxx xxx() {
        return new Xxx();
    }
}

@Slf4j
class Xxx {
    public Xxx() {
         log.info("Xxx");
    }

    private void init() {
        log.info("init");
    }

    private void destory() {
        log.info("destory");
    }

}
