package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${demo}")
    String demo;

    @RequestMapping(value = "/demo")
    public String foo(){
        return demo;
    }
}
