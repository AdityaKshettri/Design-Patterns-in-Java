package com.aditya.project.structural.bridge;

import com.aditya.project.structural.bridge.device.Device;
import com.aditya.project.structural.bridge.device.Radio;
import com.aditya.project.structural.bridge.device.Tv;
import com.aditya.project.structural.bridge.remote.AdvancedRemote;
import com.aditya.project.structural.bridge.remote.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
