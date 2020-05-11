package com.eis.conspect.java.java8.stream.methods;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TerminalMethods {

    /**
     * Возвращает первый элемент из стрима (возвращает Optional)
     */
    @Test
    public void testFindFirst() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523);
        Integer x = intList.stream().findFirst().orElse(50);
        assertThat(x).isEqualTo(1);
    }

    /**
     * Возвращает первый элемент из стрима (возвращает Optional)
     * для обычного stream возвращает первый элемент, для parallel - случайный.
     */
    @Test(invocationCount = 100)
    public void testFindAny() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        Integer x = intList.parallelStream().filter(z -> z > 0).findAny().get();
        assertThat(x).isIn(1, 523, 100, 23, 3);
    }

    /**
     * Возвращает количество элементов в stream
     */
    @Test
    public void testCount() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        long count = intList.stream().count();
        assertThat(count).isEqualTo(intList.size());
    }

    /**
     * Возвращает true, если условие выполняется хотя бы для одного элемента
     */
    @Test
    public void testAnyMatch() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        boolean result = intList.stream().anyMatch(x -> x < -10);
        assertThat(result).isTrue();
    }

    /**
     * Возвращает true, если условие не выполняется ни для одного элемента
     */
    @Test
    public void testNoneMatch() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        boolean result = intList.stream().noneMatch(x -> x > 0);
        assertThat(result).isFalse();
    }

    /**
     * Возвращает true, если условие выполняется для всех элементов
     */
    @Test
    public void testAllMatch() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        boolean result = intList.stream().allMatch(x -> x > 0);
        assertThat(result).isFalse();
    }

    /**
     * Возвращает минимальный/максимальный элемент, в качестве условия использует компаратор
     */
    @Test
    public void testMinMax() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        int minValue = intList.stream().min(Integer::compareTo).get();
        assertThat(minValue).isEqualTo(-40);

        int maxValue = intList.stream().max(Integer::compareTo).get();
        assertThat(maxValue).isEqualTo(523);
    }

    /**
     * Позволяет выполнять агрегатные функции на всей коллекцией и возвращать один результат
     */
    @Test
    public void testReduce() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 3);

        int sum = intList.stream().reduce(0, Integer::sum);

        int acc = 0;
        for (Integer element : intList) {
            acc = acc + element;
        }
        assertThat(sum).isEqualTo(acc);

        int sumWithIdentity = intList.stream().reduce(100, (x1, x2) -> x1 + x2);
        int acc1 = 100;
        for (Integer element : intList) {
            acc1 = acc1 + element;
        }
        assertThat(sumWithIdentity).isEqualTo(acc1);
    }

    @Test
    public void testSum() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 3);
        int sum = intList.stream().mapToInt(x -> x).sum();
        assertThat(sum).isEqualTo(19);
    }
}