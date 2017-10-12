package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo(){
        return foo;
    }
}
