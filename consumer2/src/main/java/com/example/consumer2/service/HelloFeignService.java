package com.example.consumer2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/12/22
 */
@Component
@FeignClient(value = "SERVICE-HI",fallback = HelloServiceHystrix.class)
public interface HelloFeignService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String home(@RequestParam("name") String name);
 
}
