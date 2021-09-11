package com.moneytap.banking;

public class DailyWithdrawalLimit extends Exception{
    public DailyWithdrawalLimit() {
    }

    public DailyWithdrawalLimit(String message) {
        super(message);
    }
}
