package com.springboot.aop.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class TrafficFortuneServiceImpl implements TrafficFortuneService{
    @Override
    public String getFortune() {
        try {
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException ex){
            throw new RuntimeException(ex);
        }
        return "Expect some traffic this morning";
    }

    @Override
    public String getFortune(boolean tripWire) {
        if(tripWire){
            throw new RuntimeException("Major accident!! Hoghway is closed");
        }
        return getFortune();
    }
}
