package com.eis.conspect.java.testing.junit.rule.examples.first;

import org.junit.rules.ExternalResource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class WebDriverRule extends ExternalResource implements WebDriver, TakesScreenshot {

    private Capabilities capabilities;
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @Override
    protected void after() {
        driver.close();
    }

    @Override
    protected void before() {
        System.out.println("Starting browser...");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Override
    public void get(String s) {
        driver.get(s);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return ((TakesScreenshot) driver).getScreenshotAs(outputType);
    }

    public void startFreshDriver() {
        System.out.println("Stopping old browser...");
        driver.quit();
        driver = new ChromeDriver();
    }
}