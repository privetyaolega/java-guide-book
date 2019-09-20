package com.eis.conspect.java.testing.junit.rule.examples.second;

import com.eis.conspect.java.testing.junit.rule.examples.first.SeleniumFixture;
import com.eis.conspect.java.testing.junit.rule.examples.second.annotations.NeedFreshDriver;
import org.junit.Test;

public class TestClass extends SeleniumFixture {

    @Test
    public void test1() {
        driver.get("http://google.com");
    }

    @Test
    @NeedFreshDriver
    public void test2() {
        driver.get("http://google.com");
    }

    @Test
    public void unstableTest() {
        throw new RuntimeException();
    }
}