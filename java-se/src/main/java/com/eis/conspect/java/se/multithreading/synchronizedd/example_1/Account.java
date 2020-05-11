package com.eis.conspect.java.se.multithreading.synchronizedd.example_1;

public class Account {

    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public synchronized void deposit(long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(long amount) {
        checkAmountNonNegative(amount);
        while (balance < amount) {
            try {
                System.out.println("withdrawThread is waiting..");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
    }

    public void checkAmountNonNegative(long balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance is less than zero!");
        }
    }

}
