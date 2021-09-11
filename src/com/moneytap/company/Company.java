package com.moneytap.company;

public class Company {

    public static void main(String[] args) {
        Employee pavan =new Employee("MT1001","Pavan","SDE",10000);
        HrDepartment hrDepartment=new HrDepartment();


        try {
           // pavan.requestCL(hrDepartment,4);
            hrDepartment.availCL(pavan, 3);
           // hrDepartment.availCL(pavan,2);
           // hrDepartment.availCL(pavan,2);
           // hrDepartment.availCL(pavan,2);
           // hrDepartment.availCL(pavan,1);
          //  hrDepartment.availCL(pavan,1);
            //hrDepartment.availCL(pavan,2);
            }catch (InvalidCLRequest invalidCLRequest){
            System.out.println(pavan.getEmpName()+"!,"+invalidCLRequest.getMessage());
        }
        catch (CLlimitExceeded cLlimitExceeded){
            System.out.println(pavan.getEmpName()+"!,"+cLlimitExceeded.getMessage());
        }
        finally {
            System.out.println("-------------------------");
            System.out.println("Have a Nice Day!");
        }
    }
}
