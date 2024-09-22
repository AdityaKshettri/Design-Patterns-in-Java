package com.aditya.project.creational.prototype.factory;

import com.aditya.project.creational.prototype.shape.Circle;
import com.aditya.project.creational.prototype.shape.Rectangle;
import com.aditya.project.creational.prototype.shape.Shape;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private final Map<String, Shape> cache = new HashMap<>();

    public PrototypeFactory() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.length = 8;
        rectangle.breadth = 10;
        rectangle.color = "Blue";

        cache.put("Big Green Circle", circle);
        cache.put("Medium Blue Rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
