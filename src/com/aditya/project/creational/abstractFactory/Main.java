package com.aditya.project.creational.abstractFactory;

import com.aditya.project.creational.abstractFactory.dialog.Dialog;
import com.aditya.project.creational.abstractFactory.factory.GUIFactory;
import com.aditya.project.creational.abstractFactory.factory.MacOSFactory;
import com.aditya.project.creational.abstractFactory.factory.WindowsFactory;

public class Main {
    private static GUIFactory factory;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static GUIFactory configure() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return factory;
    }

    private static void runBusinessLogic() {
        Dialog dialog = new Dialog(factory);
        dialog.paint();
    }
}
