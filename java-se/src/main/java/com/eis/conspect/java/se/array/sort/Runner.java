package com.eis.conspect.java.se.array.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    @Test
    public void arrayStream() {
        int[] arr = new Random().ints(10, 0, 100).toArray();

        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(Arrays.stream(arr).summaryStatistics().getAverage(), getAverage(arr));
    }

    @Test
    public void arrayMax() {
        int[] arr = new Random().ints(10, 0, 100).toArray();

        System.out.println(Arrays.toString(arr));
        Assert.assertEquals(Arrays.stream(arr).summaryStatistics().getMax(), getMax(arr));
    }

    @Test
    public void arr() {
        int[] arr = new int[]{};
        System.out.println(arr == null);
    }


    @Test
    public void numberTests() throws Exception {

        URL url = new URL("https://reqres.in/api/users/2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");

        InputStream is = connection.getInputStream();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            response.append(line).append('\r');
        }
        rd.close();

    }


    private double getAverage(int[] arr) {
        long temp = 0;
        for (int value : arr) {
            temp += value;
        }
        return (double) temp / arr.length;
    }

    private int getMax(int[] arr) {
        int max = 0;
        for (int value : arr) {
            max = Math.max(value, max);
        }
        return max;
    }

    public static int getMaxValueLoop(int[] arr) {
        if (arr.length != 0){
            int maxValue = arr[0];
            for (int value: arr) {
                maxValue = Math.max(maxValue, value);
                // maxValue = value > maxValue? value : maxValue;
            }
            return maxValue;
        }
        return 0;
    }

}