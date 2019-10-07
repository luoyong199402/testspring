package com.ly.spring.test.aspectj;

import com.ly.spring.test.bean.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectJConfig {

    @Bean
    public LogAspectj logAspectj() {
        return new LogAspectj();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator();
    }

}
