package com.eis.conspect.java.testing.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FirstTestClass {

    @Test
    @Category({MyCategories.PositiveTests.class, MyCategories.BrokenTests.class})
    public void firstTest1() {
        System.out.println("First test 1");
        System.out.println("------------------------");
    }

    @Test
    @Category({MyCategories.RegressionTests.class})
    public void secondTest1() {
        System.out.println("Second test 1");
        System.out.println("------------------------");
    }

    @Test
    @Category({MyCategories.PositiveTests.class, MyCategories.SmokeTests.class})
    public void thirdTest1() {
        System.out.println("Third test 1");
        System.out.println("------------------------");
    }
}