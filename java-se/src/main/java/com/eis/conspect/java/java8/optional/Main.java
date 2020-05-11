package com.eis.conspect.java.java8.optional;

import org.testng.annotations.Test;

import java.util.Optional;
import java.util.function.Function;

import static org.testng.Assert.assertEquals;

public class Main {

    @Test
    public void testOptional() {

        Function<String, String> getSecondWord = (String s) -> s.split(" ").length > 1 ? s.split(" ")[1] : null;
        Function<String, Integer> getLetterCount = t -> t.length();

        int resultNoNull = Optional.ofNullable(getSecondWord.apply("Hello world!")).map(getLetterCount).get();
        assertEquals(resultNoNull, 6);

        int resultNull = Optional.ofNullable(getSecondWord.apply("world!")).map(getLetterCount).orElse(666);
        assertEquals(resultNull, 666);
    }

    @Test
    public void testOptionalNull() {
        Optional<String> op = Optional.ofNullable(null);
        op.ifPresent(System.out::println);

        assertEquals( op.orElse("new value"), "new value");
    }

    @Test
    public void testOptionalNotNull() {
        Optional<String> op = Optional.ofNullable("old value");
        op.ifPresent(System.out::println);

        assertEquals(op.get(), "old value");
    }
}