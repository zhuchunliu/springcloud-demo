package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerStart.class);
    }
}
