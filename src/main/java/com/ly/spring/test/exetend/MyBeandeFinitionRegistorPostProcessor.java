package com.ly.spring.test.exetend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyBeandeFinitionRegistorPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
//        registry.registerBeanDefinition();    注册一个bean的定义信息
//        registry.removeBeanDefinition();      删除一个bean的定义信息
//        registry.getBeanDefinition()          获取一个定义的bean
//        registry.getBeanDefinitionCount()     获取定义bean的数据
//        registry.getBeanDefinitionNames()     获取所有定义bean的名称
//        registry.containsBeanDefinition()     是否包含一个bean的定义
//        registry.isBeanNameInUse()            判断一个bean是否被使用

        BeanDefinition beanDefinition = new RootBeanDefinition(MyTest.class);
//        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(MyTest.class).getBeanDefinition();
        registry.registerBeanDefinition("myText", beanDefinition);

    }


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("父类的方法");
    }
}
