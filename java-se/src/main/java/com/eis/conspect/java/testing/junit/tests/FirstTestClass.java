package com.eis.conspect.java.testing.junit.tests;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
/*
     JVM - every run will be random
     NAME_ASCENDING - alphanumeric order
     DEFAULT - consistent order (random)
 */
public class FirstTestClass {

    @Test
    public void firstTest1() {
        System.out.println("First test 1");
        System.out.println("------------------------");
    }

    @Test
    public void secondTest1() {
        System.out.println("Second test 1");
        System.out.println("------------------------");
    }

    @Test
    @Ignore
    public void thirdTest1() {
        System.out.println("Third test 1");
        System.out.println("------------------------");
    }
}