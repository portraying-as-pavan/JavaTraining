/*
package com.moneytap.driver;


import com.moneytap.pojo.Employee;
import com.moneytap.pojo.Insurance;

public class Manager extends Employee implements Insurance {

    public int teamSize;
    public int noOfProjects;
   // public String designation="Manager";
    public Manager() {
    }

    public Manager(String empId, String empName,
                   double salary, int teamSize, int noOfProjects) {
        super(empId, empName, salary);

        this.teamSize=teamSize;
        this.noOfProjects=noOfProjects;
        this.designation="Manager";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", noOfProjects=" + noOfProjects +
                ", designation='" + designation + '\'' +
                ", empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void callForMeeting(){
         System.out.println(" Manager calls for a meeting ");

    //  return meeting;
    }
    public int addProjects(int projects){
        return noOfProjects+projects;
    }
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }


    public void setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
    }
    public static void display(){
        System.out.println("manager display");
    }

    @Override
    public void createInsurance() {
        System.out.println(insuranceName+" for "+this.getEmpName());
    }
}

 */
