package com.eis.conspect.java.testing.junit.rule.examples.first;

import org.junit.Test;

public class TestExample extends SeleniumFixture {

    @Test
    public void testExample() {
        driver.get("http://google.com");
        throw new RuntimeException();
    }
}