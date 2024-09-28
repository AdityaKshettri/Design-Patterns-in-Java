package com.aditya.project.structural.decorator;

import com.aditya.project.structural.decorator.datasource.DataSource;
import com.aditya.project.structural.decorator.datasource.FileDataSource;
import com.aditya.project.structural.decorator.decorators.CompressionDecorator;
import com.aditya.project.structural.decorator.decorators.DataSourceDecorator;
import com.aditya.project.structural.decorator.decorators.EncryptionDecorator;

public class Main {

    public static void main(String[] args) {
        String input = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(input);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(input);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
