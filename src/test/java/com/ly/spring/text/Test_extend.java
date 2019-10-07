package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.exetend.MyApplicationEvent;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Test_extend {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void test_beanFactoryPostProcessor() {
        // 测试beanFaactory 创建过程
    }

    @Test
    public void test_applicationlistener() {
        MyApplicationEvent applicationEvent = new MyApplicationEvent("haha_event", this);

        context.publishEvent(applicationEvent);
        context.close();
    }

}
