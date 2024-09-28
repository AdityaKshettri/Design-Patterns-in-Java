package com.aditya.project.structural.decorator.decorators;

import com.aditya.project.structural.decorator.datasource.DataSource;

public abstract class DataSourceDecorator implements DataSource {
    private final DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
