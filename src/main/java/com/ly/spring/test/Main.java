package com.ly.spring.test;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(
        value = "com.ly.spring.test"
)
@PropertySource("classpath:Test.properties")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Main {
}
