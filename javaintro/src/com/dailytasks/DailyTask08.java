package com.dailytasks;

public class DailyTask08 {

    static int balance = 10000;

    void deposite(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {

        DailyTask08 t = new DailyTask08();

        t.deposite(30000);
        t.withdraw(10000);

        System.out.println("Final Balance: " + balance);
    }
}


