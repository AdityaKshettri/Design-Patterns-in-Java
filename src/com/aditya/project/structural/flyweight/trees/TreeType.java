package com.aditya.project.structural.flyweight.trees;

import java.awt.*;

public class TreeType {
    private final String name;
    private final Color color;

    public TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
