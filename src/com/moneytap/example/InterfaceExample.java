package com.moneytap.example;

import com.moneytap.driver.Bat;
import com.moneytap.driver.Cow;
import com.moneytap.driver.Pigeon;
import com.moneytap.pojo.Bird;
import com.moneytap.pojo.Mammal;

public class InterfaceExample {

    public static void main(String[] args) {
        Mammal cow=new Cow();
        Bird pigeon=new Pigeon();
        Bird bat=new Bat();
        Mammal bat2=new Bat();
        Bat bat3=new Bat();
        cow.eat();
      //  bat.eat();
        bat.fly();
        bat2.feed();
        bat3.fly();
        bat3.feed();
    }
}
