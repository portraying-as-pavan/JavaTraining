package com.moneytap.java8;

class Interface1Class implements Interface1{

    @Override
    public void method1(String name) {
        System.out.println("Overriding using Interface1Class"+name);
    }
}
public class Demo {

    public static void main(String[] args) {
        Interface1 i11=new Interface1Class();
        i11.method1("i11");

        Interface1 i22=new Interface1() {
            @Override
            public void method1(String name) {
                System.out.println("Overriding using inner class"+name);
            }
        };
        i22.method1("i22");

        Interface1 i33= (String name)-> System.out.println("Overriding using Lambda expression"+name);
        i33.method1("i33");

        new Thread(()-> {System.out.println("Thread using Lambda");
            System.out.println("Another Statement using Lambda Threads");}).start();
    }
}
