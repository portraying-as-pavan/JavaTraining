package com.moneytap.io;

import com.moneytap.company.Employee;

import java.io.*;
import java.util.ArrayList;

public class Persistence {

    public static void main(String[] args) throws Exception {
        Employee emp1=new Employee("MT1","Pavan","SDE Intern",10000);
        Employee emp2=new Employee("MT2","Rakesh","Tech Lead",20000);
        Employee emp3=new Employee("MT3","Ramesh","HR",15000);
        Employee emp4=new Employee("MT4","Raju","Manager",18000);

        ArrayList<Employee> employeeList=new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        FileOutputStream fout=new FileOutputStream("./resources/employeeList.txt",true);
        File file=new File("./resources/employeeList.txt");

        ObjectOutputStream out=null;
        if (file.length()<1){
            System.out.println("Inside Default OutputStream");
             out=new ObjectOutputStream(fout);
        }else {
            System.out.println("Inside EmployeeOutputStream");
           out=new EmployeeOutput(fout);
        }

        out.writeObject(employeeList);
        fout.close();
        out.close();

        System.out.println("Serialisation sucess!");
        System.out.println();


        ArrayList<Employee> empList=new ArrayList<>();
        FileInputStream fin=new FileInputStream("./resources/employeeList.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        //empList= (ArrayList<Employee>) in.readObject();

        while (true){

            try {
                empList= (ArrayList<Employee>) in.readObject();
                //empList.add(emp);
            }catch (EOFException e){
                break;
            }

        }


        in.close();
        fin.close();

        for(Employee e:empList){
            System.out.println(e);
        }
    }
}
