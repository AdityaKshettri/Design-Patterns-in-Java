package com.aditya.project.creational.builder.builder;

import com.aditya.project.creational.builder.model.CarType;
import com.aditya.project.creational.builder.product.Car;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Car getResult() {
        return new Car(carType, seats);
    }
}
