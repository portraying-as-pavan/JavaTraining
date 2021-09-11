package com.moneytap.multithreading;

public class PCDemo {
    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer pc=new ProducerConsumer();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produceEven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produceOdd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        t1.start();
        t2.start();
        t3.start();
      //  t3.start();
        t1.join();
    }
}
