package eis.com.dev.regression;

import eis.com.dev.properties.PropertiesHelper;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass1 {

    @Test
    public void test1() throws IOException {
        String str = PropertiesHelper.readProperties("src/main/resources/properties/maven.properties").getProperty("web.driver.browser");
        System.out.println(str);
    }


    @Test
    public void test2() throws IOException {
        String str = PropertiesHelper.readProperties("src/main/resources/properties/maven.properties").getProperty("web.driver.browser");
        System.out.println(str);
    }
}
