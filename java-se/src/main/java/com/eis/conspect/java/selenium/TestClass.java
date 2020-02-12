package com.eis.conspect.java.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.eis.conspect.java.selenium.TextBinMainPage.*;


public class TestClass extends BaseTest {

    private static final String BASH_CODE = "git config --global user.name  \"New Sheriff in Town\"\n" +
            "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
            "git push origin master --force\n";

    @Test
    public void test1() throws InterruptedException {
        searchInput.sendKeys();

        drpHight.selectByVisibleText(BASH_CODE);
        drpExpire.selectByVisibleText("10 Minutes");
        searchTitle.sendKeys("how to gain dominance among developers");
        pressButton.click();

        Assert.assertEquals(BASH_CODE, result.getText());
        Assert.assertEquals("Bash", result.getText());
        Assert.assertEquals("10 Minutes", result.getText());
        Assert.assertEquals("how to gain dominance among developers", result.getText());

        Thread.sleep(200000);
    }
}