package com.eis.conspect.java.se.multithreading.synchronizedd.example_1;

import java.util.stream.IntStream;

public class Starter {

    public static void main(String[] args) throws InterruptedException {

        Account account = new Account(0);

        System.out.println("Account balance before = " + account.getBalance());

        Thread depositThread = new Thread(() -> IntStream.rangeClosed(0, 10000)
                .forEach(x -> account.deposit(1)));
        Thread withdrawThread = new Thread(() -> IntStream.rangeClosed(0, 10000)
                .forEach(x -> account.withdraw(1)));

        depositThread.start();
        withdrawThread.start();

        depositThread.join();
        withdrawThread.join();

        System.out.println("Account balance after = " + account.getBalance());
    }
}
