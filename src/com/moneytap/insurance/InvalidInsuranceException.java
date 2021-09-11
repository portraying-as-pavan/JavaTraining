package com.moneytap.insurance;

public class InvalidInsuranceException extends Exception {
    public InvalidInsuranceException() {
    }

    public InvalidInsuranceException(String message) {
        super(message);
    }
}
