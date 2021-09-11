package com.moneytap.multithreading;
class SharedThread implements Runnable {

    SharedClass sharedClass;

    public SharedThread(SharedClass sharedClass) {
        this.sharedClass = sharedClass;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        synchronized (sharedClass) {

            for (int i = 0; i < 5; i++) {
                sharedClass.incrementValue();
                // Thread.sleep(2000);
                System.out.println("value in " + threadName + " is " + sharedClass.getValue());
            }
           //this.notify();
        }


    }
}
public  class SharedClassDemo {

    public static void main(String[] args) throws InterruptedException {
        SharedClass sharedClass=new SharedClass(1);
        Thread thread1=new Thread(new SharedThread(sharedClass));
        Thread thread2=new Thread(new SharedThread(sharedClass));
        thread1.start();
        thread2.start();
       // thread1.wait();
      // thread1.notify();
     //   thread1.notify();


      //  thread2.join();


        System.out.println("Inside Main, value is "+sharedClass.getValue());
 //       SharedThread thread2=new SharedThread();

      //  sharedClass.incrementValue();
    }

}
