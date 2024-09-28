package com.aditya.project.structural.decorator.datasource;

public interface DataSource {
    void writeData(String data);

    String readData();
}
