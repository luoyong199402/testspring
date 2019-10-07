package com.ly.spring.test.importbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ColorFactoryBean implements FactoryBean<PinkColor> {

    @Override
    public PinkColor getObject() throws Exception {
        return new PinkColor();
    }

    @Override
    public Class<?> getObjectType() {
        return PinkColor.class;
    }
}
