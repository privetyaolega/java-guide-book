package com.eis.conspect.java.testing.testng.factory;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {

    @BeforeClass
    public void beforeTest() {
        System.out.println("BeforeClass method");
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterClass
    public void afterTest() {
        System.out.println("AfterClass method");
    }
}
