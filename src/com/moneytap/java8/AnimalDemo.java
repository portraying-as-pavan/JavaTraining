package com.moneytap.java8;

public class AnimalDemo {
    public static void main(String[] args) {

        AnimalInterface pigeon=()->{
            System.out.println("Pigeon eating Grains");
        };

        AnimalInterface cow=()->{
            System.out.println("Cow eating grass");
        };

        cow.eat();
        pigeon.eat();
    }
}
