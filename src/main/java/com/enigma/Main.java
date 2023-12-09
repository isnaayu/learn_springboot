package com.enigma;

import com.enigma.entity.AppConfig;
import com.enigma.entity.Car;
import com.enigma.entity.Listrik;
import com.enigma.entity.Manual;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String n : context.getBeanDefinitionNames())
            System.out.println(n);

//        Car civic = (Car) context.getBean("binturang");
//        civic.startCar();
        Car toyota = (Car) context.getBean("mobil");
        toyota.startCar();















//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("master-beans.xml");
//
//        for (String n : context.getBeanDefinitionNames())
//            System.out.println(n);







//        Listrik electric = new Listrik();
//        Manual manual = new Manual();
//        Car Xenia = new Car("Xenia", electric);
//        Car Toyota = new Car("Toyota", manual);
//
//        Xenia.startCar();
//        Toyota.startCar();















//        Car car = new Car();
//        Car Xenia = new Car("Xenia", "electric");
//        Car Toyota = new Car("Toyota", "manual");
//
//        List<Car> carList = new ArrayList<>();
//        carList.add(Xenia);
//        carList.add(Toyota);
//        System.out.println(carList);
//
//        car.checkSound(Xenia);
//        car.checkSound(Toyota);
//        Xenia.checkSound(Toyota);

//        if (Xenia.getEngine()== "electric" || Toyota.getEngine()== "electric"){
//            System.out.println("Brum");
//        }else {
//            System.out.println("Sst");
//        }


    }
}