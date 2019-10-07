package com.ly.spring.test.exetend;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * 所有bean还没创建。 但是创建了定义
 */
@Component
@Slf4j
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostProcessor() {
        log.info("asdf");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int beanDefinitionCount = beanFactory.getBeanDefinitionCount();
        log.info("当前容器中定义的bean 的数量为 = {}", beanDefinitionCount);

        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        beanNamesIterator.forEachRemaining((beanName) -> {
            List<String> list = Arrays.asList("environment", "systemEnvironment", "systemEnvironment", "systemProperties",
            "org.springframework.context.annotation.ConfigurationClassPostProcessor.importRegistry");
            if (list.contains(beanName)) {
                return ;
            }

            try {
                BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
                log.info("{} 的属性有 {}", beanName, bd.getPropertyValues().toString());
            } finally {

            }

        });

    }
}
