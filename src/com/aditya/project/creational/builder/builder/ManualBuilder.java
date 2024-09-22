package com.aditya.project.creational.builder.builder;

import com.aditya.project.creational.builder.model.CarType;
import com.aditya.project.creational.builder.product.Manual;

public class ManualBuilder implements Builder {
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

    public Manual getResult() {
        return new Manual(carType, seats);
    }
}
