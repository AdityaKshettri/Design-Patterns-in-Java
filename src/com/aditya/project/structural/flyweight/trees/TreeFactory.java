package com.aditya.project.structural.flyweight.trees;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is responsible for implementing the Flyweight pattern by which
 * returns from cache instead of creating a new one again and saving memory.
 */
public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color) {
        TreeType treeType = treeTypes.get(name);
        if (treeType == null) {
            treeType = new TreeType(name, color);
            treeTypes.put(name, treeType);
        }
        return treeType;
    }
}
