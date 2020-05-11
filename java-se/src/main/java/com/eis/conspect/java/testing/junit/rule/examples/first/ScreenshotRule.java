package com.eis.conspect.java.testing.junit.rule.examples.first;

import com.google.common.io.Files;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotRule extends TestWatcher {

    private WebDriver driver;

    public ScreenshotRule(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println(String.format("TEST METHOD '%s' FAILED! Taking screenshot...", description.getMethodName()));
        File tmp = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            File scr = new File("src/main/java/" + description.getTestClass().getPackage().getName().replace(".", "/") + "/"
                    + description.getMethodName() + (int)(Math.random()*1000) + ".png");
            Files.copy(tmp, scr);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}