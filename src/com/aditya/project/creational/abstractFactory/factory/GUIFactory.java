package com.aditya.project.creational.abstractFactory.factory;

import com.aditya.project.creational.abstractFactory.button.Button;
import com.aditya.project.creational.abstractFactory.checkbox.Checkbox;

/**
 * This implementation distinguishes it from FactoryMethod
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
