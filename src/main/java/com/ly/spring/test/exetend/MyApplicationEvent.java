package com.ly.spring.test.exetend;

import org.springframework.context.ApplicationEvent;

public class MyApplicationEvent extends ApplicationEvent {
    private String eventName;

    public MyApplicationEvent(String eventName, Object source) {
        super(source);
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return eventName;
    }
}
