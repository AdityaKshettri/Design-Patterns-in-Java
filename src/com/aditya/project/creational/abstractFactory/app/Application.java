package com.aditya.project.creational.abstractFactory.app;

import com.aditya.project.creational.abstractFactory.button.Button;
import com.aditya.project.creational.abstractFactory.checkbox.Checkbox;
import com.aditya.project.creational.abstractFactory.factory.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
