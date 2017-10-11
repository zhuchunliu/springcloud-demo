package com.spring.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.spring.cloud.service.IndexService;
import com.spring.cloud.service.InfoService;
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
    private InfoService infoService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/index")
    public String index(){
        return indexService.index();
    }

    @RequestMapping("/value")
    public String value(){
        return infoService.info();
    }

    @RequestMapping("/ribbon")
    public String ribbon(){
        return "ribbon";
    }


    @HystrixCommand(fallbackMethod = "errSelf")
    @RequestMapping("/self")
    public String self(){
//        return "abc"+System.currentTimeMillis();
        return restTemplate.getForObject("http://eureka-client-demo/index",String.class)+" "+System.currentTimeMillis();
    }



    public String errSelf(){
        return "errSelf";
    }

}
