package com.eis.conspect.java.se.comparator;

import org.testng.annotations.Test;

import java.util.*;

public class CompareExample {

    @Test
    public void testExample() {
        User user1 = new User(23);
        User user2 = new User(18);
        User user3 = new User(18);
        User user4 = new User(29);

        List<User> userList = Arrays.asList(user1, user2, user3, user4);


        Comparator<User> userComparator = (u1, u2) -> {
            if (u1.getAge() == u2.getAge()) {
                return 0;
            }
            return (u1.getAge() > u2.getAge()) ? -1 : 1;
        };

        user1.compareTo(user2);

        userList.sort(userComparator);

        System.out.println(userList.toString());

    }
}