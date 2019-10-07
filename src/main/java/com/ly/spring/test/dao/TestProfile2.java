package com.ly.spring.test.dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component(value = "testProfile")
public class TestProfile2 implements TestProfile {
    @Override
    public String show() {
        return "TestProfile2";
    }
}
