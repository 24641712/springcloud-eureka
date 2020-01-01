package com.example.consumer2.controller;

import com.example.consumer2.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/feign/hi")
    public String hi1(@RequestParam("name")String name){
        return helloFeignService.home(name);
    }

    @RequestMapping(value = "/h1",method = RequestMethod.GET)
    public String h1(@RequestParam String string){
        return helloFeignService.h1(string);
    }


}
