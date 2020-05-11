package com.eis.conspect.java.java8.stream.methods;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class IntStreamSummaryStatistics {

    @Test
    public void testIntSummaryStatistics() {
        List<Integer> intList = Arrays.asList(1, -23, 0, 523, 100, 23, -40, 3);
        IntSummaryStatistics intSummaryStatistics = intList.stream().mapToInt(x -> x).summaryStatistics();

        assertThat(intSummaryStatistics.getAverage()).isEqualTo(73.375);
        assertThat(intSummaryStatistics.getCount()).isEqualTo(intList.size());
        assertThat(intSummaryStatistics.getMax()).isEqualTo(523);
        assertThat(intSummaryStatistics.getMin()).isEqualTo(-40);
        assertThat(intSummaryStatistics.getSum()).isEqualTo(587);
    }
}