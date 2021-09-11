package com.moneytap.driver;

import com.moneytap.pojo.Car;

public class Nexon extends  Car{

    public Nexon() {
    }

    public Nexon(String carName, int engineCapacity, String driverName) {
        super(carName, engineCapacity, driverName);
    }

    @Override
    public String toString() {
        return "Nexon{" + super.toString()+
                //"roofTop=" + roofTop +
                ", driverName='" + driverName + '\'' +
                '}';
    }
/*
    @Override
   public void setDriverName(String newName){
        driverName=newName;
   }

    @Override
    public void accelerate() {
        System.out.println("Nexon accelerating");
    }

    @Override
    public void applyBrake() {
        System.out.println("Nexon Slowing down");
    }



 */

}
