package com.eis.conspect.java.testing.junit.fixtures;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseFixtureClass {

    @BeforeClass
    public static void setUpBaseClass() {
        System.out.println("BEFORE BASE CLASS");
    }

    @AfterClass
    public static void tearDownBaseClass() {
        System.out.println("AFTER BASE CLASS");
    }
}
