package com.eis.conspect.java.patterns.creational.builder.cars;

public enum Type {

    CITY_CAR("City car"),
    SPORTS_CAR("Sport car"),
    SUV("Suv");

    String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
