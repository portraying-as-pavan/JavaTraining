package com.moneytap.pojo;

import com.moneytap.insurance.Insurance;
import com.moneytap.insurance.InvalidInsuranceClaimException;

public class Employee {
    public String empId;
    public String empName;
    public String designation;
    public int salary;

    public static int assuredAmount;

//Insurance insurance=null;
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
               // ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
    public Employee(){

    }

    public Employee(String empId, String empName, String designation, int  salary) {
        this.empId = empId;
        this.empName = empName;
       this.designation = designation;
        this.salary = salary;
    }



    public static boolean claimInsurance(int amount) throws InvalidInsuranceClaimException {
        if(amount<=assuredAmount){
            System.out.println("Insurance Granted= "+amount);
            assuredAmount-=amount;
            System.out.println("Insurance Amount left "+assuredAmount);
            return true;
        }else{

            throw new InvalidInsuranceClaimException("Amount claimed is greater than assured Amount");
        }
    }
    public void hike(int percent){
        salary+=(salary*percent)/100;
    }
    public void hike(){
        salary+=salary*0.1;
    }
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    /*
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }*/

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAssuredAmount() {
        return assuredAmount;
    }

    public void setAssuredAmount(int assuredAmount) {
        this.assuredAmount = assuredAmount;
    }

    public static void display(){
        System.out.println("Employee");
    }
}
