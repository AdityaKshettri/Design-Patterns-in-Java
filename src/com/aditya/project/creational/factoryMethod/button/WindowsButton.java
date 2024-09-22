package com.aditya.project.creational.factoryMethod.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("You have created Window Button");
    }
}
