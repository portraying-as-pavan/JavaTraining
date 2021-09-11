package com.moneytap.driver;

import com.moneytap.pojo.Car;

public class Breeza extends Car {

    public boolean roofTop;

    public Breeza(boolean roofTop) {
        this.roofTop = roofTop;
    }

    public Breeza(String carName, int engineCapacity, String driverName, boolean roofTop) {
        super(carName, engineCapacity, driverName);
        this.roofTop = roofTop;
    }

    public boolean isRoofTop() {
        return roofTop;
    }

    public void setRoofTop(boolean roofTop) {
        this.roofTop = roofTop;
    }
/*
    @Override
    public void accelerate() {
        System.out.println("Breeza is accelerating");
    }

    @Override
    public void applyBrake() {
        System.out.println("Breeza is slowing down");
    }

    @Override
    public String toString() {
        return "Breeza "+super.toString();
    }

 */
}
