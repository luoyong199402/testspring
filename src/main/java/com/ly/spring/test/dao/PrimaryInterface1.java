package com.ly.spring.test.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Repository
public class PrimaryInterface1 implements PrimaryInterface {
    @Override
    public String toString() {
        return "PrimaryInterface1";
    }
}
