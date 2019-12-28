package com.example.consumer2.service;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/12/24
 */
@Component
public class HelloServiceHystrix implements HelloFeignService{
    @Override
    public String home(String name) {
        return "调用feign出错请重试";
    }
}
