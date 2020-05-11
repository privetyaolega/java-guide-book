package com.eis.conspect.java.java8.stream.creation;

import com.google.common.collect.ImmutableMap;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreationStream {

    @Test
    public void testCreateStream() throws IOException {

        Arrays.asList("a1", "a2", "a3").stream();

        Stream.of("a1", "a2", "a3");

        String[] array = {"a1", "a2", "a3"};
        Arrays.stream(array);

        // Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме) - Files.lines(путь_к_файлу)
        Stream<String> streamFromFiles = Files.lines(Paths.get("file.txt"));

        "123".chars().summaryStatistics().getMax();

        Stream.builder().add("a1").add("a2").add("a3").build();

        Stream.iterate(1, n -> n + 1); // 1, 2, 3, 4,… N.

        Stream.generate(() -> Math.random()).limit(20).distinct();

        ImmutableMap.of("firstKey", "firstVal", "secondKey", "secondVal").entrySet().stream();
        ImmutableMap.of("firstKey", "firstVal", "secondKey", "secondVal").keySet().stream();
        ImmutableMap.of("firstKey", "firstVal", "secondKey", "secondVal").values().stream();
    }
}