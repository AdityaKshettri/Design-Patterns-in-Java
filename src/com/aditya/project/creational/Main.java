package com.aditya.project.creational;

import com.aditya.project.creational.abstractFactory.app.Application;
import com.aditya.project.creational.abstractFactory.factory.GUIFactory;
import com.aditya.project.creational.abstractFactory.factory.MacOSFactory;
import com.aditya.project.creational.abstractFactory.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        Application application = new Application(factory);
        application.paint();
    }
}
