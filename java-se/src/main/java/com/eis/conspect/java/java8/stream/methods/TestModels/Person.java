package com.eis.conspect.java.java8.stream.methods.TestModels;

public class Person {

    private String name;
    private int age;
    private String country;

    public Person(int age, String country, String name) {
        this.age = age;
        this.country = country;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
