package com.moneytap.insurance;

import com.moneytap.pojo.Employee;

public class Insurance {
    public static String insuranceName;
    public static int amount;

    public Insurance() {
    }


    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;

    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void addEmployeeInsurance(Employee emp) throws InvalidInsuranceException {

        if(insuranceName.equals("Term Insurance")){
            amount=emp.getSalary()*12*10;
        }
        else if(insuranceName.equals("Medical Insurance"))
        amount= emp.getSalary()*12;
        else{
            throw new InvalidInsuranceException("This Insurance isn't supported");
        }
        emp.setAssuredAmount(amount);
    }

}
