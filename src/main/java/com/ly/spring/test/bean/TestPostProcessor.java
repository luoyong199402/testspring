package com.ly.spring.test.bean;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (StringUtils.equals(beanName, "testBean")) {
            log.info("postProcessAfterInitialization BeanPostProcessor的bean生命周期 bean = {}, beanName = {}" , bean, beanName);
        }

        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (StringUtils.equals(beanName, "testBean")) {
            log.info("postProcessBeforeInitialization BeanPostProcessor的bean生命周期 bean = {}, beanName = {}" , bean, beanName);
        }

        return bean;
    }
}
