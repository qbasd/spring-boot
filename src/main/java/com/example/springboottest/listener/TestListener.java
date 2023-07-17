package com.example.springboottest.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class TestListener implements ApplicationListener <TestEvent> {

    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println("有人触发了事件："+event.getSource());
    }
}
