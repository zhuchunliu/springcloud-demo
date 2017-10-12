package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.cloud.controller")
public class ConfigClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStart.class);
    }
}
