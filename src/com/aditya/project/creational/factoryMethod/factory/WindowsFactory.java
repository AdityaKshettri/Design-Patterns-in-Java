package com.aditya.project.creational.factoryMethod.factory;

import com.aditya.project.creational.factoryMethod.button.Button;
import com.aditya.project.creational.factoryMethod.button.WindowsButton;

public class WindowsFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
