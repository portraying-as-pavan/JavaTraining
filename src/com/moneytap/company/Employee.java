package com.moneytap.company;

import java.io.Serializable;

public class Employee implements Serializable {
    public String empId, empName,designation;
    public double salary;
    public int casualLeavesLeft =6;

 //  HrDepartment hrDepartment;


   public void hike(double percent){
       salary+=salary*percent/100;
   }
  /*
   public void requestCL(HrDepartment hrDepartment,int clRequired) throws CLlimitExceeded,InvalidCLRequest{
       hrDepartment.availCL(this,clRequired);
   }

   */
    public Employee() {
    }

    public Employee(String empId, String empName, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", casualLeavesLeft=" + casualLeavesLeft +
              //  ", hrDepartment=" + hrDepartment +
                '}';
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getCasualLeavesLeft() {
        return casualLeavesLeft;
    }

    public void setCasualLeavesLeft(int casualLeavesLeft) {
        this.casualLeavesLeft = casualLeavesLeft;
    }
}
