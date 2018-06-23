package com.ming.spi.service;

import java.util.ServiceLoader;

public class Test {

    public static void main(String[] args) throws Exception {
        ServiceLoader<DogService> loaders = ServiceLoader.load(DogService.class);
        for (DogService d : loaders) {
            d.sleep();
        }
    }
}