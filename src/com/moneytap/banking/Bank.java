package com.moneytap.banking;

public class Bank {

    String bankName;
    BankCustomer bankCustomer=new BankCustomer();
    public int dailyLimit=40000;
    public int minimumBalance=1000;
    public Bank(){}

    public Bank(String bankName) {
        this.bankName = bankName;
    }
    /*
    public void dailyLimitChecker(BankCustomer bankCustomer) throws DailyWithdrawalLimit{
        if(bankCustomer.getDailyWithdrawal()>dailyLimit){
            throw new DailyWithdrawalLimit("You have crossed the daily withdrawal limit of 40,000/-");
        }
    }

    */
    public void minimumBalanceCheck(BankCustomer bankCustomer) throws MinimumBalanceLimit{
        int balance=bankCustomer.getBalance();
        if(balance<minimumBalance){
            throw new MinimumBalanceLimit("You don't have the Minimum Balance in your account");
        }
        else{
            System.out.println("Account Balance is Greater than Minimum Balance ");
        }
    }
    public boolean withdraw(BankCustomer bankCustomer,int amountWithdraw) throws InsufficientAmount,DailyWithdrawalLimit{

        int balance=bankCustomer.getBalance();

        if(bankCustomer.getDailyWithdrawal()+amountWithdraw>dailyLimit){
            throw new DailyWithdrawalLimit("You have crossed the daily withdrawal limit of 40,000/-");
        }


        if(balance<amountWithdraw){
            throw new InsufficientAmount("Amount Not Sufficient");
        }
        else{
            bankCustomer.setBalance(balance-amountWithdraw);
            bankCustomer.setDailyWithdrawal(bankCustomer.getDailyWithdrawal()+amountWithdraw);
           return true;
        }


     //   return false;
    }


    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(int dailyLimit) {
        this.dailyLimit = dailyLimit;
    }
}
