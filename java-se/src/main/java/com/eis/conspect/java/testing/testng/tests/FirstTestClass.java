package com.eis.conspect.java.testing.testng.tests;

import org.testng.annotations.Test;

@Test // All methods will be tests except of private
public class FirstTestClass {

    /*
            Documentations -> https://testng.org/doc/documentation-main.html#testng-xml
     */

    @Test(groups = {"smoke", "unstable"})
    public void firstTest1() {
        System.out.println("First test 1");
        System.out.println("smoke, unstable");
        System.out.println("------------------------");
    }

    @Test(groups = {"smoke"})
    public void secondTest1() {
        System.out.println("Second test 1");
        System.out.println("smoke, regression");
        System.out.println("------------------------");
    }

    @Test(groups = {"regression"})
    public void thirdTest1() {
        System.out.println("Third test 1");
        System.out.println("regression");
        System.out.println("------------------------");
    }
}