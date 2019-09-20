package com.eis.conspect;

public class Main {

    public static void main(String[] args) {

        int lines = 119;

        int maxSymbols = lines * 2 - 1;
        int indexMiddleElement = (maxSymbols - 1) / 2;

        String[] line = fillInArray(new String[maxSymbols]);
        line[indexMiddleElement] = "*";

        for (int writeIndex = 0; writeIndex < lines; writeIndex++) {
            line[indexMiddleElement - writeIndex] = "*";
            line[indexMiddleElement + writeIndex] = "*";
            System.out.println(String.join("", line));
        }
    }

    private static String[] fillInArray(String[] arr) {
        String[] newArray = arr;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = " ";
        }
        return newArray;
    }
}