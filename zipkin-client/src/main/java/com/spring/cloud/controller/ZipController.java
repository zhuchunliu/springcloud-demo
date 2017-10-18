package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class ZipController {

    @Value("${customer.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/info")
    public String client_info(){
        System.err.println("client_info方法被调用了……");
        return "client_info";
    }

    @RequestMapping("/value")
    public String value(){
        return restTemplate.getForObject(url,String.class);
    }

}
