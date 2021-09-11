package com.moneytap.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Test implements Runnable{
    String name;
    public Test(String name) {
       this.name=name;
    }

    @Override
    public void run() {

        try {
            System.out.println("Intialising "+name);
            Thread.sleep(2000);
            System.out.println("Executing "+name);
            Thread.sleep(1000);
            System.out.println("Ending "+name);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ExecutorServiceDemo {
    static final int MAX_T=1;
    public static void main(String[] args) {
        Runnable r1=new Test("task-1 ");
        Runnable r2=new Test("task-2 ");
        Runnable r3=new Test("task-3 ");
        Runnable r4=new Test("task-4 ");
        Runnable r5=new Test("task-5 ");

        ExecutorService pool= Executors.newFixedThreadPool(MAX_T);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();


    }
}
