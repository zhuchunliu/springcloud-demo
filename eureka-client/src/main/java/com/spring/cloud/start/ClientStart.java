package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Darren on 2017/9/20.
 */
@SpringBootApplication
@ComponentScan("com.spring.cloud.controller")
@EnableEurekaClient
public class ClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ClientStart.class,args);
    }
}
