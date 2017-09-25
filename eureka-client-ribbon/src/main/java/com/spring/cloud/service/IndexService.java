package com.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Darren on 2017/9/24.
 */
@Service
public class IndexService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errMethod")
    public String index(){
        return restTemplate.getForObject("http://eureka-client-demo/index",String.class);
    }

    public String errMethod(){
        return "errMethod";
    }
}
