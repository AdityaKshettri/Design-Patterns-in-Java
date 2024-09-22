package com.aditya.project.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("A");
        Singleton singleton2 = Singleton.getInstance("B");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value); // same as A
    }
}
