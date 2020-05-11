package com.eis.conspect.java.se.multithreading;

import java.util.stream.IntStream;

public class ThreadCreation {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        thread1.start();

        Runnable runnable = () -> IntStream.rangeClosed(1, 100).forEach(x -> System.out.println("Thread from main" + " " + x));
        Thread thread3 = new Thread(runnable);
        thread3.start();

        Thread thread2 = new Thread(new MyThread1());
        thread2.start();

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        IntStream.rangeClosed(1, 100).forEach(x -> System.out.println("Thread extends Thread" + " " + x));
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        IntStream.rangeClosed(1, 100).forEach(x -> System.out.println("Thread implements Runnable" + " " + x));
    }
}