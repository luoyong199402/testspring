package com.ly.spring.test.exetend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@Slf4j
public class MyTest {
    public MyTest() {
        log.info("haha");
    }

    @EventListener({ MyApplicationEvent.class })
    public void testAnonationEventLisener(ApplicationEvent applicationEvent) {
        log.info("想不到吧。 这个是罗勇通过注解监听进去的。 {} " + applicationEvent.toString());
    }
}
