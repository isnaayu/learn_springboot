package com.enigma.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.enigma.entity")
public class AppConfig {

//    @Bean(name = "binturang")
//    public Car car(@Qualifier("Manual") Engine engine){
//        return new Car(engine);
//    }
}
