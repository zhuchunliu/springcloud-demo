package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Darren on 2017/9/21.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.spring.cloud.inter") // 设定interface包所在路径
@ComponentScan("com.spring.cloud")
public class ClientStartFeign {

    public static void main(String[] args) {
        SpringApplication.run(ClientStartFeign.class);
    }
}
