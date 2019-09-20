package com.eis.conspect.java.patterns.structural.decorator.decorators;

public interface DataSource {

    void writeData(String data);
    String readData();
}