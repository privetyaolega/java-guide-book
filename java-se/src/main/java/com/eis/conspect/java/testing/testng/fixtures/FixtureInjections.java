package com.eis.conspect.java.testing.testng.fixtures;


import com.eis.conspect.java.testing.junit.rule.examples.second.annotations.NeedFreshDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class FixtureInjections {

    @BeforeMethod
    public void setUp(Method m) {
        if (m.getAnnotation(NeedFreshDriver.class) != null) {
            System.out.println("Actions");
        }
    }

    @Test
    @NeedFreshDriver
    public void testOne() {
        System.out.println("First test");
        System.out.println("------------------------");
    }

    @Test
    public void testTwo() {
        System.out.println("Second test");
        System.out.println("------------------------");
        throw new RuntimeException();
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            System.out.println("Taking screenshot after failure.. " + result.getName());
        }
    }

}
