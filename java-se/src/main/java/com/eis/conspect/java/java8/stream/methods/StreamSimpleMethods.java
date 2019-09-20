package com.eis.conspect.java.java8.stream.methods;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static toolkit.verification.CustomAssertions.assertThat;

public class StreamSimpleMethods {

    /**
     * Отфильтровывает записи, возвращает только записи, соответствующие условию
     */
    @Test
    public void testFilter() {
        List<String> stringList = Arrays.asList("first", "second", "hello", "world", "java", "abc");

        List filterCollection = stringList.stream().filter(x -> x.length() > 4).collect(Collectors.toList());
        assertThat(filterCollection).isEqualTo(Arrays.asList("first", "second", "hello", "world"));
    }

    /**
     * Позволяет пропустить N первых элементов
     */
    @Test
    public void testSkip() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List skipFourFirstElementsList = intList.stream().skip(4).collect(Collectors.toList());
        assertThat(skipFourFirstElementsList).isEqualTo(Arrays.asList(123, 2, -12, 1, 0));
    }

    /**
     * Возвращает стрим без дубликатов (для метода equals)
     */
    @Test
    public void testDistinct() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List onlyUniqueElements = intList.stream().distinct().collect(Collectors.toList());
        assertThat(onlyUniqueElements).isEqualTo(Arrays.asList(1, -23, 0, 523, 123, 2, -12));
    }

    /**
     * Преобразует каждый элемент стрима
     */
    @Test
    public void testMap() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List eachElementPlusTen = intList.stream().map(x -> x + 10).collect(Collectors.toList());
        assertThat(eachElementPlusTen).isEqualTo(Arrays.asList(11, -13, 10, 533, 133, 12, -2, 11, 10));
    }

    /**
     * Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
     * Операция является конвеерной (работа со стримом продолжается) в отличие от forEach
     */
    @Test
    public void testPeek() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List peekList = intList.stream().peek(System.out::println).collect(Collectors.toList());
        assertThat(peekList).isEqualTo(intList);
    }

    /**
     * Позволяет ограничить выборку определенным количеством первых элементов
     */
    @Test
    public void testLimit() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List limitList = intList.stream().limit(4).collect(Collectors.toList());
        assertThat(limitList).isEqualTo(Arrays.asList(1, -23, 0, 523));
    }

    /**
     * Позволяет сортировать значения либо в натуральном порядке, либо задавая Comparator
     */
    @Test
    public void testSorted() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 123, 2, -12, 1, 0);

        List sortedList = intList.stream().sorted().collect(Collectors.toList());
        assertThat(sortedList).isEqualTo(Arrays.asList(-23, -12, 0, 0, 1, 1, 2, 123, 523));
    }

    /**
     * Аналог map, но возвращает числовой стрим (то есть стрим из числовых примитивов)
     */
    @Test
    public void testMapToInt() {
        List<String> stringList = Arrays.asList("a", "first", "second", "hello", "world", "java", "abc");

        List<Integer> eachWordLengthList = stringList.stream().mapToInt(String::length).boxed().collect(Collectors.toList());
        assertThat(eachWordLengthList).isEqualTo(Arrays.asList(1, 5, 6, 5, 5, 4, 3));
    }

    /**
     * Аналог map, но возвращает числовой стрим (то есть стрим из числовых примитивов)
     */
    @Test
    public void testMapToInt1() {
        List<String> stringList = Arrays.asList("a", "first", "second", "hello", "world", "java", "abc");

        List<Integer> eachWordLengthList = stringList.stream().mapToInt(String::length).boxed().collect(Collectors.toList());
        assertThat(eachWordLengthList).isEqualTo(Arrays.asList(1, 5, 6, 5, 5, 4, 3));
    }
}