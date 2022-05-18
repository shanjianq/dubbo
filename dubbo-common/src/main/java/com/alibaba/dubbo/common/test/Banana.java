package com.alibaba.dubbo.common.test;

import com.alibaba.dubbo.common.URL;

public class Banana implements FruitGranter{
    @Override
    public String watering(URL url) {
        System.out.println("watering banana");
        return "banana";
    }

    @Override
    public String eat(URL url) {
        System.out.println("eat banana");
        return "banana";
    }
}
