package com.example.springboottest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async
    public void test(){
        try {
            Thread.sleep(3000);
            System.out.println("我是异步方法！");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
