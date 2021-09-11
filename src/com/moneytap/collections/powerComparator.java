package com.moneytap.collections;

import java.util.Comparator;

public class powerComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return (int)(o1.getPower()-o2.getPower());
    }


}
