package com.eis.conspect.java.testing.testng.parameters;

import com.eis.conspect.java.testing.junit.rule.examples.second.annotations.SingleParameterDataSource;
import com.eis.conspect.java.testing.testng.parameters.dataProvider.DataProviders;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestDataProviderFromField {

    @SuppressWarnings("unused")
    public static String[] arrayTestData = new String[]{"aaa", "bbb", "ccc"};

    @SuppressWarnings("unused")
    public static List<String> sampleList = Arrays.asList("aaa", "bbb", "ccc");

    @Test(dataProviderClass = DataProviders.class, dataProvider = "arrayDataProvider")
    @SingleParameterDataSource("arrayTestData")
    public void testWithParameters(String damage) {
        System.out.println("Damage = " + damage);
    }
}
