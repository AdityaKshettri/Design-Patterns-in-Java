package com.aditya.project.creational.builder;

import com.aditya.project.creational.builder.builder.CarBuilder;
import com.aditya.project.creational.builder.builder.ManualBuilder;
import com.aditya.project.creational.builder.director.Director;
import com.aditya.project.creational.builder.product.Car;
import com.aditya.project.creational.builder.product.Manual;

public class Main {
    private static Director director;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        director = new Director();
    }

    private static void runBusinessLogic() {
        buildProductCar();
        buildProductManual();
    }

    private static void buildProductCar() {
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car Type: " + car.getCarType());
    }

    private static void buildProductManual() {
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        manual.print();
    }
}
