package com.moneytap.jdbc;

import com.moneytap.pojo.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Locale;

public class prepareStatementDemo {
    public static void createInsurance(Connection con){
        try {
            Statement statement= con.createStatement();
            String query="create table insurance("+
                    "insuranceId integer primary key not null,"+
                    "insuranceName varchar(50),"+
                    "sumAssured integer)";
            statement.execute(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static void insertEmployees(Connection con,ArrayList<Employee> empList){
        String query="insert into employees values(?,?,?,?);";
        try {
            PreparedStatement pStatement= con.prepareStatement(query);

            for(Employee emp:empList){
                pStatement.setString(1, emp.getEmpId());
                pStatement.setString(2,emp.getEmpName());
                pStatement.setString(3,emp.getDesignation());
                pStatement.setInt(4,emp.getSalary());
                pStatement.execute();
                System.out.println("Inserted into employee table");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void updateEmployees(Connection con,Employee emp){
        try {
            Statement statement= con.createStatement();
            String query="update  employees set designation= 'Senior Manager2' where empId="+emp.getEmpId();
            System.out.println(query);
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void hikeSalary(Connection con,int percent){
        try {
            double hike=percent/100;
            Statement statement= con.createStatement();
            String query="update  employees set salary=employees.salary*hike";
            System.out.println(query);
           // statement.executeUpdate(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Employee emp1=new Employee("MT1001","Pavan2","SDE2",10000);
        Employee emp2=new Employee("MT1011","Rakesh2","Manager2",15000);
        Employee emp3=new Employee("MT1012","Ramesh2","Tech Lead2",25000);
        Employee emp4=new Employee("MT1013","Raju2","Marketing2",16000);
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        try {
            Connection con=JDBCDemo.connectDB("company");
            con.setAutoCommit(false);
          //  insertEmployees(con,empList);
          //  createInsurance(con);
            updateEmployees(con, emp1);
           // hikeSalary(con,10);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
