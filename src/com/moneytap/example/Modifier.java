package com.moneytap.example;

public class Modifier {

/*

    static int a,b,c;
    public int d=0;
    static{
        System.out.println("Inside Static Block");
        a=10;
        b=20;
        c=30;
    }*/
    static int count;
    public final int a;
    static {
        count++;
    }
    {
        System.out.println("Inside Intializer Block");
        a=10;
    }
    public Modifier() {
        System.out.println("Constructor called");

    }
}
