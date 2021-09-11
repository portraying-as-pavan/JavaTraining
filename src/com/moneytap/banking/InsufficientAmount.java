package com.moneytap.banking;

public class InsufficientAmount extends Exception{

    public InsufficientAmount(){}

    public InsufficientAmount(String msg){
        super(msg);
    }

}
