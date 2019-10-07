package com.ly.spring.test.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("test")
@Component(value = "testProfile")
public class TestProfile1 implements TestProfile {
    @Override
    public String show() {
        return "TestProfile1";
    }
}
