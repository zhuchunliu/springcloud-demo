package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class ZipChildController {

    @Value("${customer.url}")
    private String url;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/info")
    public String value(){
        System.err.println("child info方法被调用了……");
        return "customer child info";
    }

    @RequestMapping("/value")
    public String info(){
        return restTemplate.getForObject(url,String.class);
    }


}
