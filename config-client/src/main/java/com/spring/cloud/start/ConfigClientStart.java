package com.spring.cloud.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.spring.cloud.controller")
public class ConfigClientStart {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientStart.class);
    }

    @Autowired
    void setEnvironment(Environment env) {
        System.out.println("demo from master: " + env.getProperty("demo"));
    }
}
