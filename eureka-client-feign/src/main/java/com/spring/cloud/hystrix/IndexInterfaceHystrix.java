package com.spring.cloud.hystrix;

import com.spring.cloud.inter.IndexInterface;
import org.springframework.stereotype.Component;

/**
 * Created by Darren on 2017/9/25.
 */
@Component
public class IndexInterfaceHystrix implements IndexInterface {
    @Override
    public String index() {
        return "err msg";
    }
}
