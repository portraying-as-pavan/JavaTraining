package com.moneytap.java8;

import com.moneytap.pojo.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
/*
        Stream<Integer> stream1=Stream.of(1,2,3,4,5);
        stream1.forEach(System.out::print);
        System.out.println();

        Integer[] arr=new Integer[]{6,7,8,9,10};
        Stream<Integer> stream2=Stream.of(arr);
        stream2.forEach(System.out::print);
        System.out.println();

        List<Integer> list= Arrays.asList(arr);
        Stream<Integer> stream3=list.stream();
       // stream3.forEach(System.out::print);
        stream3.filter(
                (num)-> num>7 && num<10
        ).map(
                (num)->
                { System.out.println(num+" is multiplied by 10"); return num*10; }
        ).forEach(
                (num)->System.out.print(num+" ")
        );
        System.out.println();



        String[] strArr=new String[]{"A","BB","CCC","DDDD","CEEEE"};
        List<String> strList= Arrays.asList(strArr);
        strList.stream()
                .filter(
                        (s)-> s.length()>2 && (s.startsWith("C"))
                ).map(
                        (s)->s.toLowerCase(Locale.ROOT)
        ).forEach(System.out::print);

 */

        Employee emp1=new Employee("MT1006","Akshay","SDE",100000);
        Employee emp2=new Employee("MT1007","Rakesh","Manager",55000);
        Employee emp3=new Employee("MT1008","Ramesh","Tech Lead",45000);
        Employee emp4=new Employee("MT1009","Akash","Marketing",26000);
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        List<Employee> salaryGreaterThan30k=empList.stream()
                .filter((employee)-> employee.getSalary()>=30000)
                .collect(Collectors.toList());

        List<Employee> nameStartsWithA=empList.stream()
                .filter((employee)-> employee.getEmpName().startsWith("A")||employee.getEmpName().startsWith("a"))
                .collect(Collectors.toList());

        boolean salaryGreaterThan100k=empList.stream()
                .anyMatch((emp)->emp.getSalary()>=100000);

        int countManager =(int)empList.stream().filter((employee)->employee.getDesignation().equals("Manager"))
                .count();

        System.out.println("Employees with salary greater than 30k");
        System.out.println(salaryGreaterThan30k);
        System.out.println("============================");

        System.out.println("Employees with Name Starting with A");
        System.out.println(nameStartsWithA);
        System.out.println("============================");


        System.out.println("Employees with salary greater than 100k? :"+salaryGreaterThan100k);
        System.out.println("============================");

        System.out.println("Number of managers= "+ countManager);
    }
}
