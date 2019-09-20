package com.eis.conspect.java.se.array.sort;

import org.testng.annotations.Test;

import static com.eis.conspect.java.se.array.sort.Sort.bubbleSort;
import static com.eis.conspect.java.se.array.sort.Sort.selectedSort;
import static com.eis.conspect.java.se.array.sort.StandardActions.printArray;
import static com.eis.conspect.java.se.array.sort.StandardActions.randomArr;

public class Runner {

    @Test
    public void testArray() {
        int[] array1 = randomArr(5);
        printArray(array1);
        bubbleSort(array1).printArray();

        int[] array2 = randomArr(25);
        printArray(array2);
        selectedSort(array2).printArray();
    }
}