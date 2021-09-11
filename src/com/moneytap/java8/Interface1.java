package com.moneytap.java8;

public interface Interface1 {

    default void print1(){
        System.out.println("Inside print1");
    }
    default void print2(){
        System.out.println("Inside print2");
    }
    void method1(String name);
}
