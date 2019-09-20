package com.eis.conspect.java.testing.testng.tests;

import org.testng.annotations.Test;

public class ThirdTestClass {

    @Test(groups = {"smoke"})
    public void firstTest3() {
        System.out.println("First test 3");
        System.out.println("smoke");
        System.out.println("------------------------");
    }

    @Test(groups = {"smoke", "unstable"})
    public void secondTest3() {
        System.out.println("Second test 3");
        System.out.println("smoke, unstable");
        System.out.println("------------------------");
    }

    @Test(groups = {"unstable"})
    public void thirdTest3() {
        System.out.println("Third test 3");
        System.out.println("unstable");
        System.out.println("------------------------");
    }
}