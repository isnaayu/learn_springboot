package com.enigma.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobil")
public class Car {
    private String name;
    private Engine engine;

    public Car() {
    }

    public Car(String name, @Qualifier("Listrik") Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    @Autowired //di injek
    public Car(@Qualifier("Listrik") Engine engine) {
        this.engine = engine;
    }

    public void startCar(){
        engine.start();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
