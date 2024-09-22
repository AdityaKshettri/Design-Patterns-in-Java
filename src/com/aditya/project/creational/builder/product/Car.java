package com.aditya.project.creational.builder.product;

import com.aditya.project.creational.builder.model.CarType;

public class Car {
    private final CarType carType;
    private final int seats;

    public Car(CarType carType, int seats) {
        this.carType = carType;
        this.seats = seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }
}
