package model;

import exceptions.InvalidDaysException;

public class Truck extends Vehicle {
    public Truck(String patent) {
        super(patent);
        this.basePrice.setValue(1800);
    }

    @Override
    public Price consultRentalPrice(int days) {
        if(days <= 0){
            throw new InvalidDaysException();
        }
        this.basePrice.multiply(days);
        return this.basePrice;
    }
}
