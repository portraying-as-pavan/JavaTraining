package com.moneytap.java8;

import com.moneytap.pojo.Employee;

public class Employee1 implements Comparable<Employee1>{
    public String empName, designation,gender;
    public int salary,age,yearOfJoining, empId;

    public Employee1(int empId, String empName, int age,String gender, String designation,int yearOfJoining,  int salary ) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
        this.yearOfJoining = yearOfJoining;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", yearOfJoining=" + yearOfJoining +
                '}';
    }


   @Override
    public int compareTo(Employee1 o) {
        return this.getEmpId()-o.getEmpId();
    }
}
