package com.moneytap.driver;

import com.moneytap.pojo.Animal;

public class Cow implements Animal {
    @Override
    public void eat() {
        System.out.println("Cow is eating");
    }

    @Override
    public void feed() {
        System.out.println("Cow is Feeding");
    }
}
