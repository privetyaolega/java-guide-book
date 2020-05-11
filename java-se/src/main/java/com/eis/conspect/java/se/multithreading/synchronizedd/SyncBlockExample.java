package com.eis.conspect.java.se.multithreading.synchronizedd;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyncBlockExample {

    public static void main(String[] args) {
        new Worker().main();
    }
}

/**
 * synchronized(obj) {...}: monitor - обьект obj
 * synchronized void method() {...}: monitor - обьект this
 * synchronized static void method() {...}: monitor - обьект .class
 *
 *
 * Добавляя ключевое слово synchronized к методу, мы синхронизируем потоки по
 * экземпляру класса this, в следствии чего, потоки ждут, пока поток освободит
 * метод, хотя потоки работают с разными коллекциями (пример снизу)
 *
 * Синхронизируя потоки каждый по своему монитору, за счет создания каждому
 * потоку своего лока (обьекта синхронизации), по которому мы впоследствии
 * синхронизируемся в synchronized block, мы предотвращаем конкурирования потоков
 * и достигаем паралельности.
 *
 */

class Worker {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    private List list1 = new ArrayList();
    private List list2 = new ArrayList();

    private void addToList1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(new Random(100));
        }
    }

    private void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(new Random(100));
        }
    }

    private void work() {
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }


    public void main() {
        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(this::work);
        Thread thread2 = new Thread(this::work);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long finishTime = System.currentTimeMillis();

        System.out.println("Program took: " + (finishTime - startTime) + "ms");

        System.out.println("List 1: " + list1.size());
        System.out.println("List 2: " + list2.size());
    }
}