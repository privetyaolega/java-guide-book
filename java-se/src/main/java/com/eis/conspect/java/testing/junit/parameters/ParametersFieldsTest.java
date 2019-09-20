package com.eis.conspect.java.testing.junit.parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametersFieldsTest {

    /*
            Parameters work for all methods, even if test doesn't use them (disadvantage)
            In order to parameters work only for methods, we should use external libraries e.g 'JUnit Data Provider', 'JUnitParams'
            It works as in TestNG
     */

    @Parameter()
    public String user;

    @Parameter(1)
    public String password;

    @Parameters(name = "user:{0}, password:{1}")
    public static Collection<Object[]> users() {
        return Arrays.asList(new Object[][]{
                {"superLogin", "superPassword"},
                {"vasya1992", "qwert19852"},
                {"guestLogin", "guestPassword"}
        });
    }

    @Test
    public void testLogin() {
        System.out.println("Test data: " + user + password);
    }
}