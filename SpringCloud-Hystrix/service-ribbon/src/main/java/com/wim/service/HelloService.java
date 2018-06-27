package com.wim.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wim
 * @version 1.0
 * @since 2018年06月27日
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //创建了熔断器的功能，并指定了fallbackMethod熔断方法，熔断方法直接返回了一个字符串
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi/?name=" + name, String.class);
    }


    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
