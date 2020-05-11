package com.eis.conspect.java.testing.junit.rule.examples.second;

import com.eis.conspect.java.testing.junit.rule.examples.first.WebDriverRule;
import com.eis.conspect.java.testing.junit.rule.examples.second.annotations.NeedFreshDriver;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class FreshDriverRule extends TestWatcher {

    private WebDriverRule driverRule;

    public FreshDriverRule(WebDriverRule driverRule) {
        this.driverRule = driverRule;
    }

    @Override
    protected void starting(Description description) {
        if (description.getAnnotation(NeedFreshDriver.class) != null) {
            System.out.println("Restarting a browser");
            driverRule.startFreshDriver();
        }
    }
}
