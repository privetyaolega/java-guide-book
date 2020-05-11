package com.eis.conspect.java.testing.junit.rule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.rules.RuleChain;

public class ExternalResourceExample {

    /**
     * Standard rules:
     * 1) ExternalResourse: start and stop a server for example
     * 2) TemporaryFolder: create fresh files and delete after test
     * 3) TestName: remember the test name for use during the method
     * 4) TestWatcher: add logic at events during method execution
     * 5) Timeout: cause test to fail after a set time
     * 6) ExpectedException: make flexible assertion about thrown exceptions
     * 7) ErrorCollectors: collect multiple errors in one test method
     * 8) Verifier: fail test if object state ends up incorrect
     */

    @Rule
    public static ExternalResource loginRule = new ExternalResource() {
        @Override
        protected void before() {
            System.out.println("log in");
        }

        @Override
        protected void after() {
            System.out.println("log out");
        }
    };

    @Rule
    public static ExternalResource driverRule = new ExternalResource() {
        @Override
        protected void before() {
            System.out.println("Starting a browser");
        }

        @Override
        protected void after() {
            System.out.println("Stopping a browser");
        }
    };

    @ClassRule
    public static RuleChain rules = RuleChain.outerRule(driverRule).around(loginRule);

}