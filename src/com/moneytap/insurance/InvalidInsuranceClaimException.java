package com.moneytap.insurance;

public class InvalidInsuranceClaimException extends Exception{
    public InvalidInsuranceClaimException() {
    }

    public InvalidInsuranceClaimException(String message) {
        super(message);
    }
}
