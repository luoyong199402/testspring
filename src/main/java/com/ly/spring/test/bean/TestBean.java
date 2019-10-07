package com.ly.spring.test.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@Slf4j
public class TestBean implements InitializingBean, DisposableBean, ApplicationContextAware {
    private ApplicationContext applicationContext;

    public  TestBean() {
        log.info("test init.  这个对象被创建。");
    }

    private String name;

    public void customInit() {
        log.info("TestBean init");
    }

    public void customDestroy() {
        log.info("TestBean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("实现接口的生命周期方法。 afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        log.info("实现接口的生命周期方法。 destroy");
    }

    @PostConstruct
    private void anonationInit() {
        log.info("使用注解的初始化 @JSR250 @PostConstruct");
    }

    @PreDestroy
    private void anonationDestroy() {
        log.info("使用注解的初始化 @JSR250 @PreDestroy");

    }



}
