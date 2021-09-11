package com.moneytap.jdbc;

import com.moneytap.pojo.Employee;

import java.sql.*;
import java.util.ArrayList;

public class JDBCDemo {
    public static Connection connectDB(String company) throws ClassNotFoundException, SQLException{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/"+company;
        String uName="postgres";
        String password="postgres";
        Connection con= DriverManager.getConnection(url,uName,password);
        if (con!=null){
            System.out.println("Connection to "+company+" established");
        }
        else {
            System.out.println("Problem Connecting to "+company+" ............");
        }

        return con;
    }
    public static String getInsertQuery(Employee e){
        String empId=e.getEmpId();
        String empName=e.getEmpName();
        String designation=e.getDesignation();
        int salary=e.getSalary();
        String query="insert into employees values('"+empId+"','"+empName+"','"+designation+"',"+salary+")";
        return query;
    }
    public static void main(String[] args) {

        try {

            Employee emp1=new Employee("MT1006","Pavan","SDE",10000);
            Employee emp2=new Employee("MT1007","Rakesh","Manager",15000);
            Employee emp3=new Employee("MT1008","Ramesh","Tech Lead",25000);
            Employee emp4=new Employee("MT1009","Raju","Marketing",16000);
            ArrayList<Employee> empList=new ArrayList<>();
            empList.add(emp1);
            empList.add(emp2);
            empList.add(emp3);
            empList.add(emp4);
            System.out.println(emp1);



            Connection con=connectDB("company");

                System.out.println("Connection Established.............");
                Statement statement=con.createStatement();
                String query="select empName,designation,salary from employees where salary>=100000;";
                ResultSet rs=statement.executeQuery(query);
                while (rs.next()){
                   // String empid=rs.getString("empId");
                    String empName=rs.getString("empName");
                    String designation=rs.getString("designation");
                    int salary=rs.getInt("salary");

                   // Employee emp=new Employee(empid,empName,designation,salary);
                    System.out.println(empName+" "+designation+" has "+salary);
                }
//Commented Insert statements
/*
                for(Employee e:empList){
                    String query=getInsertQuery(e);
                    System.out.println(query);
                    statement.execute(query);
                    System.out.println("Added"+e+" to database");
                    System.out.println("======================");
                }
                System.out.println("Added Everything............");

 */
                statement.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
