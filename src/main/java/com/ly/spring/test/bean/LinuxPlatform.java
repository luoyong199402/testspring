package com.ly.spring.test.bean;

public class LinuxPlatform implements Platform {
    @Override
    public String showPlatformName() {
        return "linux platform";
    }
}
