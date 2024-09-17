package com.aditya.project.creational.abstractFactory.button;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOS Button");
    }
}
