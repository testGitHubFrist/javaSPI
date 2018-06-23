package com.ming.spi.service.imp;

import com.ming.spi.service.DogService;

public class WhilteDogServiceImpl implements DogService{

    @Override
    public void sleep() {
        System.out.println("白色dog。。。呼呼大睡觉...");
        
    }

}