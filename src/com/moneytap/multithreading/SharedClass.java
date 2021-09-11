package com.moneytap.multithreading;

public class SharedClass {
    public int value;

    public SharedClass(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
    public  void incrementValue(){
        synchronized (this) {
            value++;
        }
    }
}
