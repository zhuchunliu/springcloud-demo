package com.spring.cloud.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by Darren on 2017/10/19 0019
 **/
@SpringBootApplication
@EnableTurbine
public class TurbineStart {
    public static void main(String[] args) {
        SpringApplication.run(TurbineStart.class);
    }
}
