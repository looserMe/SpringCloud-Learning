package com.wim.web;

import com.wim.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wim
 * @version 1.0
 * @since 2018年06月27日
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(@RequestParam String name) {
        return helloService.hi(name);
    }
}
