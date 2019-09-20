package com.eis.conspect.java.testing.testng.parameters;

import com.eis.conspect.java.testing.testng.parameters.dataProvider.DataProviders;
import org.testng.annotations.Test;

public class TestWithParametersFromDataProviders {

    @Test(dataProviderClass = DataProviders.class, dataProvider = "usersFromFile")
    public void testWithParameters(String login, String password) {
        System.out.println(String.format("Test with parameters: %s, %s", login, password));
        System.out.println("--------------------------");
    }
}
