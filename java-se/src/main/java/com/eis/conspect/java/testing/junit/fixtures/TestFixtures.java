package com.eis.conspect.java.testing.junit.fixtures;

import org.junit.*;

public class TestFixtures extends BaseFixtureClass{

    @BeforeClass
    public static void setUpClass() {
        System.out.println("BEFORE CLASS");
    }

    @Before // Before each method
    public void setUp() {
        System.out.println("BEFORE");
    }

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

    @After // Before each method
    public void tearDown() {
        System.out.println("AFTER");
        System.out.println("=========================");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("AFTER CLASS");
        System.out.println("=========================");
    }

}
