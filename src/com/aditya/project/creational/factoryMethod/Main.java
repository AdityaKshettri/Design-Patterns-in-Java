package com.aditya.project.creational.factoryMethod;

import com.aditya.project.creational.factoryMethod.factory.GUIFactory;
import com.aditya.project.creational.factoryMethod.factory.MacOSFactory;
import com.aditya.project.creational.factoryMethod.factory.WindowsFactory;

public class Main {
    private static GUIFactory factory;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
    }

    private static void runBusinessLogic() {
        factory.renderButton();
    }
}
