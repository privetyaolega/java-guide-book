package com.eis.conspect.java.testing.testng.parameters.dataProvider;

import com.eis.conspect.java.testing.junit.rule.examples.second.annotations.SingleParameterDataSource;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static com.eis.conspect.utils.properties.PropertiesHelper.readProperties;

public class DataProviders {

    private final String DATA_PROVIDER_PATH = "src/main/java/com/eis/conspect/java/testing/testng/parameters/dataProvider/users.properties";

    /**
     * Data provider must return Object[][]/Object[] or Iterator<Object[]>/Iterator<Object>
     */

    @DataProvider
    private Object[][] arrayDataProvider(Method method) throws NoSuchFieldException, IllegalAccessException {
        if (method.isAnnotationPresent(SingleParameterDataSource.class)) {
            if (method.getParameterTypes().length != 1) {
                throw new RuntimeException("Method should have a single parameter: " + method);
            }

            SingleParameterDataSource dataSource = method.getAnnotation(SingleParameterDataSource.class);
            Class clazz = dataSource.clazz();
            if (clazz.equals(void.class)) {
                clazz = method.getDeclaringClass();
            }

            Field field = clazz.getField(dataSource.value());
            Object[] data = (Object[]) field.get(null);

            Object[][] result = new Object[data.length][];
            for (int i = 0; i < data.length; i++) {
                result[i] = new Object[]{data[i]};
            }
            return result;
        } else {
            throw new RuntimeException("There is no @SingleParameterDataSource annotation on method: " + method);
        }
    }

    @DataProvider

    private Iterator<Object[]> usersFromFile() throws IOException {
        List<Object[]> data = new ArrayList<>();
        readProperties(DATA_PROVIDER_PATH).forEach((key, value) -> data.add(new Object[]{key, value}));
        return data.iterator();
    }

    @DataProvider
    private Iterator<Object[]> usersData() {
        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"SuperuserLogin", "SuperuserPassword"});
        data.add(new Object[]{"pavel1993", "hello1252"});

        return data.iterator();
    }

    @DataProvider
    private Iterator<Object[]> usersRandomData() {
        List<Object[]> data = new ArrayList<>();
        IntStream.range(1, 10).forEach(x -> data.add(new Object[]{generateRandomLogin(), generateRandomPassword()}));
        return data.iterator();
    }

    private String generateRandomLogin() {
        return "user" + new Random().nextInt(10000);
    }

    private String generateRandomPassword() {
        return "password" + new Random().nextInt(10000);
    }
}