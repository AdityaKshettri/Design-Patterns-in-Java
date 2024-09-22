package com.aditya.project.creational.prototype;

import com.aditya.project.creational.prototype.factory.PrototypeFactory;
import com.aditya.project.creational.prototype.shape.Shape;

public class Main {
    public static void main(String[] args) {
        PrototypeFactory factory = new PrototypeFactory();

        Shape shape1 = factory.get("Big Green Circle");
        Shape shape2 = factory.get("Medium Blue Rectangle");
        Shape shape3 = factory.get("Medium Blue Rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big Green Circle != Medium Blue Rectangle");
        } else {
            System.out.println("Big Green Circle == Medium Blue Rectangle");
        }

        if (shape2 != shape3) {
            System.out.println("Medium Blue Rectangle are 2 different objects");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical");
            } else {
                System.out.println("But they are not identical");
            }
        } else {
            System.out.println("Rectangle objects are the same");
        }
    }
}
