package com.wim.service;

import org.springframework.stereotype.Component;

/**
 * @author wim
 * @version 1.0
 * @since 2018年06月27日
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
