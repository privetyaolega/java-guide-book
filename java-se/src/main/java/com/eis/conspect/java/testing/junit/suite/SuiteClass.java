package com.eis.conspect.java.testing.junit.suite;

import com.eis.conspect.java.testing.junit.tests.FirstTestClass;
import com.eis.conspect.java.testing.junit.tests.SecondTestClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        FirstTestClass.class,
        SecondTestClass.class
})
public class SuiteClass {


}
