package com.eis.conspect.java.rest.unirest.vk;

import com.eis.conspect.java.rest.unirest.vk.model.User;
import org.testng.annotations.Test;

import static com.eis.conspect.java.rest.unirest.vk.Mapper.getUserGet;

public class Starter {

    @Test
    public void test() throws Exception {
        User user = getUserGet("126624");
        System.out.println(user);
    }
}