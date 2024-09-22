package com.aditya.project.creational.factoryMethod.factory;

import com.aditya.project.creational.factoryMethod.button.Button;

/**
 * This implementation distinguishes it from AbstractFactory
 */
public abstract class GUIFactory {

    public void renderButton() {
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
