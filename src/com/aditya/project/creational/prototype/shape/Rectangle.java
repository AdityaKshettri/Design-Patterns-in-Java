package com.aditya.project.creational.prototype.shape;

public class Rectangle extends Shape {
    public int length;
    public int breadth;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        if (target != null) {
            this.length = target.length;
            this.breadth = target.breadth;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle rectangle) || !super.equals(obj)) return false;
        return rectangle.length == length && rectangle.breadth == breadth;
    }
}
