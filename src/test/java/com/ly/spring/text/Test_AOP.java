package com.ly.spring.text;

import com.ly.spring.test.Main;
import com.ly.spring.test.bean.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Test_AOP {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    @Test
    public void test_AOP() {
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.cal();
        log.info(calculator.toString());
    }
}
