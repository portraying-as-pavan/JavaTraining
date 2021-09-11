package com.moneytap.multithreading;

class MyThread extends Thread{
   // @Override
    public void run(){
        System.out.println();
        System.out.println("Entered "+Thread.currentThread().getName()+" .............");
        /*
        for (int i=0;i<10;i++){
            System.out.println("Inside MyThread :"+i);
        }

         */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of My Thread Thread............");
        System.out.println();
    }
}

class RunnableThread implements Runnable{

    @Override
    public void run() {
        System.out.println();
        System.out.println("Entered "+Thread.currentThread().getName()+" .............");
        /*
        for (int i=0;i<10;i++){
            System.out.println("Inside Runnable Thread :"+i);

        }

         */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("End of Runnable Thread............");
        System.out.println();
    }
}
public class MyThreadDemo{
    public static void main(String[] args) throws InterruptedException {

        Thread myThread=new MyThread();
        myThread.setName("MyThread");

        Thread runnableThread=new Thread(new RunnableThread());
        runnableThread.setName("Runnable thread");
        System.out.println("Entered "+Thread.currentThread().getName()+" .............");
        runnableThread.start();
        myThread.start();

        myThread.join();
        Thread.sleep(2000);

/*
        for(int i=0;i<10;i++){
            System.out.println("Inside Main Thread: "+i);
        }

 */
        System.out.println("End of Main Thread..................");
        System.out.println();
    }
}
