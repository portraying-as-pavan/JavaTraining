package com.moneytap.multithreading;

import java.util.Scanner;
import java.util.Stack;

public class ProducerConsumer {
    Stack<Integer> stack=new Stack<>();
    int value=0,capacity=1;
    public void produceEven() throws InterruptedException {


        while (value<7) {
            synchronized (this) {
                if(stack.size()==capacity || value%2!=0)
                    wait();

                stack.push(value++);
                System.out.println("Produced Even Value: "+value);
                //    System.out.println("Produced........");
                notify();
            }
        }
    }

    public void consume() throws InterruptedException {

        while (value<8) {
            synchronized (this) {
                if(stack.isEmpty())
                    wait();
                System.out.println("Consumed Value= "+stack.pop());
               // System.out.println("Consumed............");
                notify();
            }
        }
    }

    public void produceOdd() throws InterruptedException {
        while (value<7) {
            synchronized (this) {
                if(stack.size()==capacity || value%2==0)
                    wait();

                stack.push(value++);
                System.out.println("Produced Odd Value: "+value);
                //    System.out.println("Produced........");
                notify();
            }
        }
    }
}
