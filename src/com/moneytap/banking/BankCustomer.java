package com.moneytap.banking;

public class BankCustomer {
    public int id;
    public int balance;
    public int dailyWithdrawal;

    public BankCustomer(){};
    public BankCustomer(int id, int balance) {
        this.id = id;
        this.balance = balance;
        this.dailyWithdrawal=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDailyWithdrawal() {
        return dailyWithdrawal;
    }

    public void setDailyWithdrawal(int dailyWithdrawal) {
        this.dailyWithdrawal = dailyWithdrawal;
    }
}
