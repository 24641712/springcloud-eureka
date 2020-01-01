package com.example.consumer2;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Consumer2ApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    @Test
    void contextLoads() {
        String mima = encryptor.encrypt("123456");
        System.out.println("密钥："+mima);
        System.out.println(encryptor.decrypt(mima));

    }

}
