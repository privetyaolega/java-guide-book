package com.eis.conspect.java.testing.testng.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParametersFromXML {

    @Test
    @Parameters({"login", "password"})
    public void testWithParameters(String login, String password) {
        System.out.println(String.format("Test with parameters: %s, %s", login, password));
        System.out.println("--------------------------");
    }
}
