package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Darren on 2017/9/20.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan("com.spring.cloud")
public class ClientStartRibbon {
    public static void main(String[] args) {
        SpringApplication.run(ClientStartRibbon.class);
    }

    @Bean
    @LoadBalanced  //开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
