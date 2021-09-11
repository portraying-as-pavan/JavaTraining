package com.moneytap.collections;

import java.util.Comparator;

public class ownerNameComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getOwnerName().compareTo(o2.getOwnerName());
    }
}
