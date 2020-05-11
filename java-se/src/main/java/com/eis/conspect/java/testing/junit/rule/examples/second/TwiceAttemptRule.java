package com.eis.conspect.java.testing.junit.rule.examples.second;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TwiceAttemptRule implements TestRule {

    @Override
    public Statement apply(Statement statement, Description description) {
        return new RunTwiceStatement(statement, description);
    }

    public class RunTwiceStatement extends Statement {

        private final Statement base;
        private Description description;

        public RunTwiceStatement(Statement base, Description description) {
            this.base = base;
            this.description = description;
        }

        @Override
        public void evaluate() throws Throwable {
            try {
                base.evaluate();
            } catch (Throwable throwable) {
                System.out.println("Failed on first attempt: " + description);
                base.evaluate();
            }
        }
    }
}
