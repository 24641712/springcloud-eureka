package com.example.consumer2.controller;

import com.example.consumer2.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/12/22
 */
@RestController("/feign")
public class HelloController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping(value = "/hi")
    public String hi1(@RequestParam("name")String name){
        return helloFeignService.home(name);
    }

}
