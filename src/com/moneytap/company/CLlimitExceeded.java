package com.moneytap.company;

public class CLlimitExceeded extends Exception{
    public CLlimitExceeded() {
    }

    public CLlimitExceeded(String message) {
        super(message);
    }
}
