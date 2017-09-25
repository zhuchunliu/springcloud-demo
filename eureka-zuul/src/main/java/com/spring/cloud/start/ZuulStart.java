package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Darren on 2017/9/25.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@ComponentScan("com.spring.cloud.config")
public class ZuulStart {

    public static void main(String[] args) {
        SpringApplication.run(ZuulStart.class);
    }

}
