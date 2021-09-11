package com.moneytap.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

    public static void main(String[] args) {

        Employee emp1=new Employee("MT1001","Pavan","SDE",10000);
        Employee emp2=new Employee("MT1002","Rakesh","SDE",10000);
        Employee emp3=new Employee("MT1001","Rajesh","SDE",10000);
        Employee emp4=new Employee("MT1001","Ramesh","SDE",10000);

        ArrayList<Employee> employeesList=new ArrayList<>();

        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
/*
        System.out.println("Using For Each Loop");
        for (Employee emp:employeesList
             ) {
            System.out.println(emp.getEmpName());
        }
*/
        System.out.println("Hike Using Iterator");
        Iterator<Employee> employeeIterator=employeesList.iterator();

        while(employeeIterator.hasNext()){
           // System.out.println(employeeIterator.next().getEmpName());
            Employee emp=employeeIterator.next();
            emp.hike(10);
        }

        Iterator<Employee> empiterator=employeesList.iterator();
        while(empiterator.hasNext()) {
             System.out.println(empiterator.next().getSalary());
        }


        ArrayList<String> names=new ArrayList<>();
        names.add("A");
        names.add("B");

        ListIterator<String> namesIterator=names.listIterator();
        while (namesIterator.hasNext()){
            String name=namesIterator.next();
            if(name=="B"){
                name="C";
            }
            namesIterator.set(name);

        }
    }
}
