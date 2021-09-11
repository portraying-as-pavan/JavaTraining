package com.moneytap.generics;

import com.moneytap.company.Employee;

import java.util.ArrayList;

public class Test <T>{
    T obj;

    public Test(T obj) {
        this.obj = obj;
    }
    public T returnObject(){
        return obj;
    }

    public static<T> void genericDisplay(T t){
        System.out.println(t.getClass().getName());
        System.out.println(t);
    }

    public static void main(String[] args) {
        Employee emp=new Employee("MT!001","Pavan","SDE",1000);
        genericDisplay(emp);
        genericDisplay("String");

        ArrayList l=new ArrayList();
        l.add("P");
        l.add(1);
    }
}
