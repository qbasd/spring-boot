package com.example.springboottest.controller;

import com.example.springboottest.listener.TestEvent;
import com.example.springboottest.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
@Slf4j
@Controller
public class MainController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
