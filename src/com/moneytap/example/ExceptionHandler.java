package com.moneytap.example;

public class ExceptionHandler {

   public static void Interrupt(int ms) throws InterruptedException{
      // return a/b;

       if(ms<0){
           throw new ArithmeticException("Seconds can't be less than Zero");
       }
       else {
           Thread.sleep(ms);
       }
   }
}
