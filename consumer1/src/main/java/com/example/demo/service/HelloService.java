package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Company: Tope
 * Created Date : 2019/12/22
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

}
