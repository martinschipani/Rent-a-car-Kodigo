package model;

import exceptions.InvalidDaysException;

public class Truck extends Vehicle {
    public Truck(String patent) {
        super(patent);
        this.basePrice.setValue(1800);
    }

    @Override
    public Price consultRentalPrice(int days) {
        Price consultPrice = setUpConsult(days);
        consultPrice.multiply(days);
        return consultPrice;
    }
}
