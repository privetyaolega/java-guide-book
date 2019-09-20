package com.eis.conspect.java.testing.testng.tests;

import org.testng.annotations.Test;

public class SecondTestClass {

    @Test(groups = {"smoke"})
    public void firstTest2() {
        System.out.println("First test 2");
        System.out.println("smoke");
        System.out.println("------------------------");
    }

    @Test(groups = {"regression"})
    public void secondTest2() {
        System.out.println("Second test 2");
        System.out.println("regression");
        System.out.println("------------------------");
    }

    @Test(groups = {"regression"})
    public void thirdTest2() {
        System.out.println("Third test 2");
        System.out.println("regression");
        System.out.println("------------------------");
    }
}