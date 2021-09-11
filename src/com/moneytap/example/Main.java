package com.moneytap.example;

import com.moneytap.banking.*;
import com.moneytap.pojo.MyException;

public class Main {

    public static void main(String[] args) {

        BankCustomer john=new BankCustomer(1,100000);
        BankCustomer rakesh=new BankCustomer(2,5000);
        BankCustomer pavan=new BankCustomer(3,30000);
        Bank sbi=new Bank("SBI");

        try{
            System.out.println("Balance before Transaction: "+john.getBalance());
            sbi.withdraw(john,30000);
            System.out.println("Balance after Transaction: "+john.getBalance()+" DailyWithdrawal done: "+john.getDailyWithdrawal());


            sbi.minimumBalanceCheck(rakesh); //Gives Minimum Balance Exception
           // sbi.withdraw(john,50000);

          boolean b= sbi.withdraw(pavan,5000); //Gives Insufficient Funds Exception

            boolean c=sbi.withdraw(john,15000);  //Gives Withdrawal Limit Exception

        }
        catch (InsufficientAmount insufficientAmount){
            System.out.println(insufficientAmount.getMessage());
        }
        catch (DailyWithdrawalLimit dailyWithdrawalLimit){
            System.out.println(dailyWithdrawalLimit.getMessage());
        }
        catch (MinimumBalanceLimit minimumBalanceLimit){
            System.out.println(minimumBalanceLimit.getMessage());
        }
        finally {
            System.out.println("Thanks for chosing SBI");
        }

      /*  try {
            sbi.withdraw(john, 2000);
            System.out.println(john.getBalance());
        }catch (InsufficientAmount e){
            System.out.println("Insufficient Funds ");
        }*/
    }
}
/*try {
            throw new MyException("This is a customised Exception");
        }catch (MyException myException){
            System.out.println(myException.getMessage());
            myException.printStackTrace();
        }*/
        //ExceptionHandler exceptionHandler=new ExceptionHandler();

      /*  try{
            exceptionHandler.DivideException(10,0);
            exceptionHandler.DivideException(20,0);
        }
        try{
            exceptionHandler.DivideException(30,0);
        }
        catch (Exception e){
            System.out.println("Exception: "+ e);
            e.printStackTrace();
        }*/

        //System.out.println("First message");
      //  int age =0;
       // try {
         //   exceptionHandler.Interrupt(2000);
            //Thread.sleep(5000);
            /*if(age<1){
                throw new Exception("Age can't be less than 1");

            }
            if(age>100){
                throw new Exception("Age can't be Greater than 100");
            }*/
        //}catch (Exception e){
         //   System.out.println("Exception: "+e.getMessage());
        //}
       // System.out.println("Second message");


