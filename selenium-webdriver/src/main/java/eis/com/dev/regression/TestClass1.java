package eis.com.dev.regression;

import eis.com.dev.properties.PropertiesHelper;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass1 {

    @Test
    public void test1() throws IOException {
        String str = PropertiesHelper.readProperties("src/main/resources/properties/my.properties").getProperty("web.driver.browser");
        System.out.println(str);
    }


    @Test
    public void test2() throws IOException {
        String str = PropertiesHelper.readProperties("src/main/resources/properties/my.properties").getProperty("test.suite");
        System.out.println(str);
        System.out.println(System.getProperty("web.driver.browser"));
    }
}
