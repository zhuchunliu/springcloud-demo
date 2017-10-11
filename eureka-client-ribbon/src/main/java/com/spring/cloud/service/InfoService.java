package com.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class InfoService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errInfo")
    public String info(){
        return restTemplate.getForObject("http://eureka-client-demo/info",String.class);
    }

    private String errInfo(){
        return "errInfo";
    }
}
