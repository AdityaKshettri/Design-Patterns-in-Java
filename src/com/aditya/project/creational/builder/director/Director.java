package com.aditya.project.creational.builder.director;

import com.aditya.project.creational.builder.builder.Builder;
import com.aditya.project.creational.builder.model.CarType;

public class Director {

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
    }

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(7);
    }
}
