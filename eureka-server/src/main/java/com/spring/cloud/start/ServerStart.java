package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Darren on 2017/9/20.
 */
@EnableEurekaServer
@SpringBootApplication
public class ServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ServerStart.class);
    }
}
