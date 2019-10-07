package com.ly.spring.test.bean;

import com.ly.spring.test.dao.PersonDao;
import com.ly.spring.test.importbean.Color;
import com.ly.spring.test.importbean.ColorBeanConfigDefiinationRegister;
import com.ly.spring.test.importbean.ColorImportSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Color.class, ColorImportSelector.class, ColorBeanConfigDefiinationRegister.class})
public class BeanConfig {

    @Bean("platform")
    @Conditional(value = {
        WindowsPlatformConditon.class
    })
    public Platform windowsPlatform() {
        return new WindowsPlatform();
    }

    @Bean("platform")
    @Conditional(value = {
            LinuxPlatformConditon.class
    })
    public Platform linuxPlatform() {
        return new LinuxPlatform();
    }

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public TestBean testBean() {
        return new TestBean();
    }

}
