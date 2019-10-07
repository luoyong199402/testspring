package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.bean.Person;
import com.ly.spring.test.bean.TestAutoWired;
import com.ly.spring.test.dao.TestProfile;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Test_Value {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void test_value() {
        Person person = (Person) context.getBean("person");
        log.info(person.toString());
    }

    @Test
    public void test_autowired() {
        TestAutoWired testAutoWired = (TestAutoWired) context.getBean("testAutoWired");

        log.info(testAutoWired.toString());
    }

    @Test
    public void test_autowired2() {
        TestAutoWired testAutoWired = (TestAutoWired) context.getBean("testAutoWired2");

        log.info(testAutoWired.toString());
    }

    @Test
    public void test_autowired3() {
        TestAutoWired testAutoWired = (TestAutoWired) context.getBean("testAutoWired");
        testAutoWired.show();
    }

    @Test
    public void test_profile() {
        TestProfile testProfile = (TestProfile) context.getBean("testProfile");
        log.info("age = {}", testProfile.show());
    }
}
