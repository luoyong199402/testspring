package com.ly.spring.test.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class PrimaryInterface2 implements PrimaryInterface {
    @Override
    public String toString() {
        return "PrimaryInterface2";
    }
}
