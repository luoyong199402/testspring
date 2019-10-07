package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.bean.Person;
import com.ly.spring.test.bean.Platform;
import com.ly.spring.test.bean.TestBean;
import com.ly.spring.test.controller.PersonController;
import com.ly.spring.test.importbean.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@Slf4j
public class Test2 {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void test1() {
        String[] definitionNames = context.getBeanDefinitionNames();
        Arrays.stream(definitionNames)
                .forEach(log::info);
        log.info(ToStringBuilder.reflectionToString(definitionNames, ToStringStyle.SHORT_PREFIX_STYLE));
    }

    @Test
    public void test2_scope() {
        Person person1 = (Person) context.getBean("person");
        Person person2 = (Person) context.getBean("person");

        log.info(ToStringBuilder.reflectionToString(person1));
        log.info(ToStringBuilder.reflectionToString(person2));

        PersonController personController1 = (PersonController) context.getBean("personController");
        PersonController personController2 = (PersonController) context.getBean("personController");

        log.info(personController1.toString());
        log.info(personController2.toString());
    }


    @Test
    public void test3_lazy() {
        log.info("获取实列前");
        PersonController personController1 = (PersonController) context.getBean("personController");
        log.info(personController1.toString());
    }

    @Test
    public void test_condition() {
        Platform platform = (Platform) context.getBean("platform");
        log.info(platform.showPlatformName());
    }

    @Test
    public void test_imort() {
        Color color = (Color) context.getBean("com.ly.spring.test.importbean.Color");
        log.info(color.toString());
    }

    @Test
    public void test_imortSelector() {
        RedColor color = (RedColor) context.getBean("com.ly.spring.test.importbean.RedColor");
        log.info(color.toString());
    }

    @Test
    public void test_ImportBeanDefinitionRegistrar() {
        BlueColor color = (BlueColor) context.getBean("blueColor");
        log.info(color.toString());
    }

    @Test
    public void test_beanFactory() {
        PinkColor color = (PinkColor) context.getBean("colorFactoryBean");
        log.info(color.toString());

        ColorFactoryBean color2 = (ColorFactoryBean) context.getBean("&colorFactoryBean");
        log.info(color2.toString());
    }

    @Test
    public void test_lifeCycle1() {
        log.info("获取对象前");

        TestBean testBean = (TestBean) context.getBean("testBean");

        log.info(testBean.toString());
        context.close();
    }

    @Test
    public void test_lifeCycle2() {
        log.info("获取对象前");

        TestBean testBean = (TestBean) context.getBean("testBean");

        log.info(testBean.toString());
        context.close();
    }

    @Test
    public void test_lifeCycle3() {
        log.info("获取对象前");

        TestBean testBean = (TestBean) context.getBean("testBean");

        log.info(testBean.toString());
        context.close();
    }

    @Test
    public void test_lifeCycle4() {
        log.info("获取对象前");

        TestBean testBean = (TestBean) context.getBean("testBean");

        log.info(testBean.toString());
        context.close();
    }

    @Test
    public void test_BeanPostProcess() {
        TestBean testBean = (TestBean) context.getBean("testBean");
        log.info("创建的上下文 {}", context);
        log.info("获取的上下文 {}", testBean.getApplicationContext().toString());
    }

}
