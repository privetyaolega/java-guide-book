package com.eis.conspect.java.se.array.sort;

public class StandardActions {

    private int[] workArray;

    public StandardActions(int[] workArray) {
        this.workArray = workArray;
    }

    public void printArray() {
        int[] array = this.getWorkArray();
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println("");
    }

    public static void printArray(int[] array) {
        for (int anArray : array) {
            System.out.print(anArray + " ");
        }
        System.out.println("");
    }

    public static int[] randomArr(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = (int) (Math.random() * 100);
        }
        return newArray;
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int[] getWorkArray() {
        return workArray;
    }
}