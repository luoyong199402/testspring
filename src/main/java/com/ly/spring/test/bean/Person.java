package com.ly.spring.test.bean;

import com.ly.spring.test.controller.PersonController;
import com.ly.spring.test.dao.PersonDao;
import com.ly.spring.test.dao.PrimaryInterface;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;
import javax.inject.Inject;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Value("10")
    private int age;

    @Value("luoyong")
    private String name;

    @Value("#{10 + 10}")
    private int age2;

    @Value("${os.name}")
    private String config;

    @Value("${peron.name}")
    private String configPersonName;

    @Autowired
    private PersonController personController;

    @Autowired
    @Qualifier("personDao")
    private PersonDao personDao;

    @Autowired
    private PrimaryInterface primaryInterface;

    @Autowired(required = false)
    @Qualifier("123")
    private PersonDao personDao2;

    @Resource
    private PersonDao personDao3;

    @Inject
    private PersonDao personDao4;
}
