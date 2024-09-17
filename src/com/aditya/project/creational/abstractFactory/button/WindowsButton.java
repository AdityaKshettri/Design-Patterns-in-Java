package com.aditya.project.creational.abstractFactory.button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Window Button");
    }
}
