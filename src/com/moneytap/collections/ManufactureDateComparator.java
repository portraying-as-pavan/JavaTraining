package com.moneytap.collections;

import java.util.Comparator;

public class ManufactureDateComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getManufactureDate()- o2.getManufactureDate();
    }
}
