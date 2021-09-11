package com.moneytap.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Car {
    public  String ownerName;
    public double power;
    public int manufactureDate;

    public Car(String ownerName, double power,int manufactureDate) {
        this.ownerName = ownerName;
        this.power = power;
        this.manufactureDate = manufactureDate;
    }
/*
     class ownerNameComparator implements Comparable<Car>{

        @Override
        public int compareTo(Car o) {
            return ownerName.compareTo(o.getOwnerName());
        }
    }

    class powerComparator implements Comparable<Car>{

        @Override
        public int compareTo(Car o) {
            return (int)(power-o.getPower());
        }
    }

    class manufacturedateComparator implements Comparable<Car>{

    @Override
    public int compareTo(Car o) {
        return manufactureDate-o.getManufactureDate();
    }
}

 */
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


}
