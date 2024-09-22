package com.aditya.project.creational.builder.builder;

import com.aditya.project.creational.builder.model.CarType;

public interface Builder {
    void setCarType(CarType carType);

    void setSeats(int seats);
}
