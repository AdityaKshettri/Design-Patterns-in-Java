package com.aditya.project.creational.abstractFactory.factory;

import com.aditya.project.creational.abstractFactory.button.Button;
import com.aditya.project.creational.abstractFactory.button.WindowsButton;
import com.aditya.project.creational.abstractFactory.checkbox.Checkbox;
import com.aditya.project.creational.abstractFactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
