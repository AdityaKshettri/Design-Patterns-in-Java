package com.aditya.project.creational.abstractFactory.factory;

import com.aditya.project.creational.abstractFactory.button.Button;
import com.aditya.project.creational.abstractFactory.button.MacOSButton;
import com.aditya.project.creational.abstractFactory.checkbox.Checkbox;
import com.aditya.project.creational.abstractFactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
