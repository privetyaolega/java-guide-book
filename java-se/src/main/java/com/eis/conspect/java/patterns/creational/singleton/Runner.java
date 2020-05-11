package com.eis.conspect.java.patterns.creational.singleton;

public class Runner {

    public static void main(String[] args) {

        Singleton firstSingleton = Singleton.getInstance("YEEEEES");
        Singleton secondSingleton = Singleton.getInstance("NOOOOOOO");


        System.out.println("First singleton = " + firstSingleton);
        System.out.println("Second singleton = " + secondSingleton);

    }
}
