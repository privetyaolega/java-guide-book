package com.eis.conspect.java.testing.testng.parameters;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample {

    @DataProvider
    private Iterator<Object[]> testData() {
        List<String> testData = Arrays.asList("first", "second", "third", "forth");
        return testData.stream().map(x -> new Object[]{x}).collect(Collectors.toList()).iterator();
    }

    @Test(dataProvider = "testData")
    public void testWithParameters(String damage) {
        System.out.println("Damage = " + damage);
    }
}