package com.moneytap.company;

public class InvalidCLRequest extends Exception{
    public InvalidCLRequest() {
    }

    public InvalidCLRequest(String message) {
        super(message);
    }
}
