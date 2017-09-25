package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Darren on 2017/9/20.
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private Integer port;

    @RequestMapping("/index")
    public String index(){
        return "index : "+port;
    }

    @RequestMapping("/info")
    public String info(){
        return "info : "+port;
    }
}
