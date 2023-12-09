package com.enigma.entity;

import org.springframework.stereotype.Component;

@Component("Listrik")
public class Listrik implements Engine{
    @Override
    public void start() {
        System.out.println("Brummm");
    }
}
