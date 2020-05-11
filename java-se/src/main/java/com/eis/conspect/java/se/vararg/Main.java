package com.eis.conspect.java.se.vararg;

public class Main {

    /*
     *
     * Variable length arguments - аргумент переменной длинны, с java 1.5
     * Либо без аргументов, либо с любым колличеством
     * Внутри неявно создается массив указанного типа
     *
     * 1 - должен быть один vararg
     * 2 - должен быть последним в списке параметров
     * 3 - нужно избегать неоднозначность
     *
     */


    static void fly(int... ints) {
        System.out.println(ints.length);
    }

    static void fly(String s, int... ints) {
        System.out.println(ints.length);
    }

//    static void fly(int... ints, String s){} - 		vararg стоит первым в списке
//    static void fly(int... ints, String... s){} - 	два vararga в списке параметров

//    static void fly(boolean... b){} 					неоднозначость
//    static void fly(int i, int... ints) {}


    public static void main(String... args) {

        fly(1, 2, 3);
        fly("Hello", 1, 2 , 3, 4, 5);
        fly(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        fly();

    }

}