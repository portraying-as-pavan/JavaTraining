package com.moneytap.generics;

import com.moneytap.collections.Car;
import com.moneytap.collections.ownerNameComparator;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> carList=new ArrayList<>();
        Car car1=new Car("Pavan",120,2017);
        Car car2=new Car("Rakesh",150,2018);
        Car car3=new Car("Abhiram",110,2019);

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

     //   List<Car> sortedByName=Collections.sort(carList, new ownerNameComparator());
        carList.sort(new ownerNameComparator());
        List<Car> sortedByName = new ArrayList<>(carList);

        List<Integer> intList=new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

       // LinkedList<Integer> llist=new LinkedList<>();


        Integer[] arrayFromList=intList.toArray(new Integer[0]);
/*
       for(Car car:sortedByName){
           System.out.println(car.getOwnerName());
       }
*/
        for( int a:arrayFromList){
            System.out.println(a);
        }

    }
}
