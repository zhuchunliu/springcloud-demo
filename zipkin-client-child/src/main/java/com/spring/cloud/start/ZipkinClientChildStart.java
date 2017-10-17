package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Darren on 2017/10/17 0017
 **/
@SpringBootApplication
@ComponentScan("com.spring.cloud.controller")
public class ZipkinClientChildStart {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientChildStart.class);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
