package com.enigma;

import com.enigma.entity.Car;
import com.enigma.entity.Listrik;
import com.enigma.entity.Manual;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Listrik electric = new Listrik();
        Manual manual = new Manual();
        Car Xenia = new Car("Xenia", electric);
        Car Toyota = new Car("Toyota", manual);

        Xenia.startCar();
        Toyota.startCar();















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