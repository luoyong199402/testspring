package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Test1 {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void test1() {
        Person person = (Person) context.getBean("person");
        log.info(person.toString());
    }

}
