package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.apache.commons.lang.RandomStringUtils.randomNumeric;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Created Date : 2020/1/1
 */
@SpringBootTest
public class HelloServiceTest {

    @Test
    public void test(){
        System.out.println(randomNumeric(4));

    }


}
