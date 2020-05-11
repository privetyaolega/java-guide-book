package com.eis.conspect.java.testing.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;

public class TestWatcherExample {

    @Rule
    public TestWatcher screenshotRul = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
            System.out.println("Method succeeded");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("TEST FAILED! SCREENSHOT...");
        }

        @Override
        protected void starting(Description description) {
            System.out.println("Method starting...");
        }

        @Override
        protected void finished(Description description) {
            System.out.println("Method finished...");
        }
    };

    @Rule
    public Timeout timeout = new Timeout(9000);

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(6000);
        throw new RuntimeException();
    }
}