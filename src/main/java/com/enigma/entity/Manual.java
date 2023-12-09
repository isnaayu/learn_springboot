package com.enigma.entity;

import org.springframework.stereotype.Component;

@Component("Manual")
public class Manual implements Engine{
    @Override
    public void start() {
        System.out.println("Sssst");
    }
}
