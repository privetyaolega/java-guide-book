package com.eis.conspect.java.testing.junit.rule.examples.first;

import com.eis.conspect.java.testing.junit.rule.examples.second.FreshDriverRule;
import com.eis.conspect.java.testing.junit.rule.examples.second.TwiceAttemptRule;
import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

public class SeleniumFixture {

    public WebDriverRule driver = new WebDriverRule();

    @Rule
    public TestRule rule = RuleChain.outerRule(driver)
            .around(new FreshDriverRule(driver))
            .around(new TwiceAttemptRule())
            .around(new ScreenshotRule(driver));
}