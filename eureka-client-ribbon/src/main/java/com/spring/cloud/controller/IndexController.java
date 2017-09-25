package com.spring.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.cloud.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Darren on 2017/9/20.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/index")
    public String index(){
        return indexService.index();
    }

    @RequestMapping("/ribbon")
    public String ribbon(){
        return "ribbon";
    }


    @HystrixCommand(fallbackMethod = "errInfo")
    @RequestMapping("/info")
    public String info(){
        return "abc";
//        return restTemplate.getForObject("http://eureka-client-demo/index",String.class);
    }



    public String errInfo(){
        return "errInfo";
    }

}
