package com.spring.cloud.inter;

import com.spring.cloud.hystrix.IndexInterfaceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Darren on 2017/9/21.
 */
@FeignClient(value = "eureka-client-demo",fallback = IndexInterfaceHystrix.class)
public interface IndexInterface {
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
