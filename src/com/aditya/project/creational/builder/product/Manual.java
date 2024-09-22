package com.aditya.project.creational.builder.product;

import com.aditya.project.creational.builder.model.CarType;

public class Manual {
    private final CarType carType;
    private final int seats;

    public Manual(CarType carType, int seats) {
        this.carType = carType;
        this.seats = seats;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public void print() {
        System.out.println("Manual Car built");
    }
}
