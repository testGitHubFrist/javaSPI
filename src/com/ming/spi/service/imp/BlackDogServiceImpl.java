package com.ming.spi.service.imp;

import com.ming.spi.service.DogService;

public class BlackDogServiceImpl implements DogService{

    @Override
    public void sleep() {
        System.out.println("黑色dog。。。汪汪叫，不睡觉...");
        
    }
    
}