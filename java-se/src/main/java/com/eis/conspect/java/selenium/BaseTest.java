package com.eis.conspect.java.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest  {

    public WebDriver driver;

    @BeforeTest // Fixture
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://textbin.net/");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
