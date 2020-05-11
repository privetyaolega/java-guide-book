package com.eis.conspect.java.testing.testng.factory;

import org.testng.annotations.Factory;

public class TestFactory {

    @Factory
    public Object[] testFactory() {
        Object[] arr = new Object[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new TestExample();
        }
        return arr;
    }
}
