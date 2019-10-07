package com.ly.spring.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Scope(value = "singleton")
@Lazy(value = false)
@Controller
@Slf4j
public class PersonController {
    public PersonController() {
        log.info("PersonController init");
    }
}
