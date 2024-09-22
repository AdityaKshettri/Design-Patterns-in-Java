package com.aditya.project.creational.factoryMethod.factory;

import com.aditya.project.creational.factoryMethod.button.Button;
import com.aditya.project.creational.factoryMethod.button.MacOSButton;

public class MacOSFactory extends GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
