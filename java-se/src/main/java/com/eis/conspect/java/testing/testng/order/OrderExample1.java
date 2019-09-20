package com.eis.conspect.java.testing.testng.order;

import org.testng.annotations.Test;

public class OrderExample1 {

    /*
                Test order can be controlled by:

                1) Config xml file
                2) @Test ( priority = 10 ) 1 - high priority
                                           9 - low priority

                3) @Test ( dependsOnMethods = { "loginTest" } )

                Note: if first test failed, second test will be skipped                      (hard dependency)
                in order to launch the second test, we should use the following property     (low dependency)
                @Test ( dependsOnMethods = "loginTest", alwaysRun = true )

    /------------------------------------------------------------------------------------------------------------------/

                Difficulties:

                1) Domino effect
                2) Debug difficulties (we need to investigate with all Before/After methods)
                3) Difficulties with failure reproduce
                4) Regrouping difficulties

     */
    @Test(priority = 9)
    public void firstTest1() {
        System.out.println("First test 1");
        System.out.println("-----------------------");

    }

    @Test(priority = 1)
    public void secondTest1() {
        System.out.println("Second test 1");
        System.out.println("-----------------------");
    }

     @Test ( dependsOnMethods = "secondTest2", alwaysRun = true )
     public void firstTest2() {
         System.out.println("First test 2");
         System.out.println("-----------------------");

     }

    @Test
    public void secondTest2() {
        System.out.println("Second test 2");
        System.out.println("-----------------------");
        throw new RuntimeException();
    }
}