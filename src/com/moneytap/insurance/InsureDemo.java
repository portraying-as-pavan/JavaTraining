package com.moneytap.insurance;

import com.moneytap.pojo.Employee;

public class InsureDemo {
    public static void main(String[] args) {
        Employee emp=new Employee("MT1001","Pavan","SDE",10000);
        Insurance insurance=new Insurance("Term Insurance");

        try {
            insurance.addEmployeeInsurance(emp);
            emp.claimInsurance(13000);
        } catch (InvalidInsuranceException e1) {
            System.out.println(e1.getMessage());
        }catch (InvalidInsuranceClaimException e2){
            System.out.println(e2.getMessage());
        }


    }


}
