package com.spring.cloud.controller;

import com.spring.cloud.inter.IndexInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Darren on 2017/9/21.
 */
@RestController
public class IndexController {

    @Autowired
    private IndexInterface indexInterface;

    @RequestMapping("/index")
    public String index(){
        return indexInterface.index();
    }

    @RequestMapping("/feign")
    public String feign(){
        return "feign";
    }
}
