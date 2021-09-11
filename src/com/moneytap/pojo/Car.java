package com.moneytap.pojo;

import java.io.Serializable;

public class Car implements Serializable {
    public String carName;
    public int engineCapacity;

    /*private String fuelType;
    public int speed,gear=0;
    private double power;*/
    //public boolean roofTop;

    public String driverName;

    public Car() {
    }

    @Override
    public String toString() {
        return
                "carName='" + carName + '\'' +
                ", engineCapacity=" + engineCapacity+" "
               // ", roofTop=" + roofTop +
               // ", driverName='" + driverName + '\''
                ;
    }

    public Car(String carName, int engineCapacity, String driverName) {
        this.carName = carName;
        this.engineCapacity = engineCapacity;
       /* this.fuelType = fuelType;
        this.power = power;
        this.speed=speed;*/
        this.driverName=driverName;
       // this.roofTop=roofTop;
    }
    /*public void changeDriverName(String newName){
        driverName=newName;
    }*/

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
   /* public void setRoofTop(boolean roofTop){
        this.roofTop=roofTop;
    }



     public abstract void accelerate();
     public abstract  void applyBrake();

    */

}
