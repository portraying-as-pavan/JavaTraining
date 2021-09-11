package com.moneytap.driver;

import com.moneytap.pojo.Bird;

public class Pigeon implements Bird {

    @Override
    public void fly() {
        System.out.println("Pigeon is Flying");
    }
/*
    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void feed() {
        System.out.println("Pigeon is feeding");
    }*/
}
