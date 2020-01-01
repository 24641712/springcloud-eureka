package com.example.demo.exception;

/**
 * @version 1.0
 * @Description :
 * Copyright: Copyright (c)2019
 * Created Date : 2020/1/1
 */
public class ProviderException extends RuntimeException{

    public ProviderException(String message){
        new RuntimeException(message);
    }

}
