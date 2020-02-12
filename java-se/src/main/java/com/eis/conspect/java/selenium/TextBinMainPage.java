package com.eis.conspect.java.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TextBinMainPage {

    @FindBy(xpath = "//[@class = 'ace_text-input')")
    public static WebElement searchInput;

    @FindBy(name = "syntax")
    public static Select drpHight;

    @FindBy(name = "expire")
    public static Select drpExpire;

    @FindBy(name = "title")
    public static WebElement searchTitle;

    @FindBy(xpath = "//button[contains(text(), 'Create New Paste')]")
    public static WebElement pressButton;

    @FindBy(xpath = "//button[contains(text(), 'Create New Paste')]")
    public static WebElement result;
}
