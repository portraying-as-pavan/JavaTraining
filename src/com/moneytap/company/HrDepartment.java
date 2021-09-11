package com.moneytap.company;

public class HrDepartment {
    Employee employee;
    public final int maxCL=3;


    public void availCL(Employee employee, int clRequired) throws InvalidCLRequest,CLlimitExceeded{
        int leavesLeft=employee.getCasualLeavesLeft();

        if(clRequired>maxCL){
            throw  new InvalidCLRequest(" Can't avail a Casual Leave of or more than "+maxCL+" days, Choose Another ");
        }
        else if(clRequired>leavesLeft){
            throw new CLlimitExceeded(" Requested Leaves is greater than the Casual Leaves left for you, CL left are "+leavesLeft+" days");
        }
        else{
            employee.setCasualLeavesLeft(leavesLeft-clRequired);
            System.out.println(" Leave application is Accepted, CL left are "+employee.getCasualLeavesLeft()+" days!");
        }
    }
}
