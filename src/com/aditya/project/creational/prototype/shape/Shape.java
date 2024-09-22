package com.aditya.project.creational.prototype.shape;

import java.util.Objects;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape)) return false;
        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }

    // This implementation makes it Prototype Design Pattern
    public abstract Shape clone();
}
