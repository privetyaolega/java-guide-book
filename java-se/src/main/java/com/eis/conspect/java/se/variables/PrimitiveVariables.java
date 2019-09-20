package com.eis.conspect.java.se.variables;

import org.testng.annotations.Test;

public class PrimitiveVariables {

    @Test
    public void primitiveVariables() {

        String hello = "hello";


        int var = (hello.length() > 15) ? 1 : 2;
        System.out.println(var);


    }
}
