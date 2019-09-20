package com.eis.conspect.java.testing.testng.assertion;

import org.hamcrest.MatcherAssert;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.hamcrest.CoreMatchers.is;

public class FirstTestClass {

    @Test
    public void testAssertKeyword() {
        assert 2 * 2 == 5;
    }

    @Test
    public void testAssertJUnit() {
        AssertJUnit.assertEquals(5, 2 * 2);
    }

    @Test
    public void testAssertTestNG() {
        Assert.assertEquals(2 * 2, 5);
    }

    @Test
    public void testSoftAssert() {
        SoftAssert s = new SoftAssert();
        s.assertEquals(2 * 2, 5, "Five");
        s.assertEquals(2 * 2, 3, "Three");
        s.assertAll();
    }

    @Test
    public void testHamcrestAssert() {
        MatcherAssert.assertThat("Five", 2 * 2, is(5));
    }
}