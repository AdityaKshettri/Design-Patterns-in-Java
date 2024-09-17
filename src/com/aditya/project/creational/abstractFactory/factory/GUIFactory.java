package com.aditya.project.creational.abstractFactory.factory;

import com.aditya.project.creational.abstractFactory.button.Button;
import com.aditya.project.creational.abstractFactory.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}
