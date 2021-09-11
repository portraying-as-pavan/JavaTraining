package com.moneytap.collections;

import com.moneytap.company.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Employee emp1=new Employee("MT1","Pavan","SDE Intern",10000);
        Employee emp2=new Employee("MT2","Rakesh","Tech Lead",20000);
        Employee emp3=new Employee("MT3","Ramesh","HR",15000);
        Employee emp4=new Employee("MT4","Raju","Manager",18000);

        HashMap<String,Employee> employeeHashMap = new HashMap<>();
        employeeHashMap.put(emp1.getEmpId(),emp1);
        employeeHashMap.put(emp2.getEmpId(),emp2);
        employeeHashMap.put(emp3.getEmpId(),emp3);
        employeeHashMap.put(emp4.getEmpId(),emp4);
        emp1.setDesignation("SDE FTE");
        Iterator<Map.Entry<String,Employee>> mapEntrySet=employeeHashMap.entrySet().iterator();

        while (mapEntrySet.hasNext()){
            Map.Entry<String,Employee> entry=mapEntrySet.next();
            entry.getValue().hike(10);
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }


 /*
        HashMap<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);

        Iterator<Map.Entry<String,Integer>> entryset= map.entrySet().iterator();

        while (entryset.hasNext()){
            Map.Entry<String,Integer> entry=entryset.next();
            System.out.println("key "+entry.getKey()+" value: "+entry.getValue());
        }

  */
    }
}
