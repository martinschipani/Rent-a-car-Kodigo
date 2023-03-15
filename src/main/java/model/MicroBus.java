package model;

import exceptions.InvalidDaysException;

public class MicroBus extends Vehicle {
    private final Characteristic adicional;
    public MicroBus(String patent) {
        super(patent);
        this.basePrice.setValue(90);
        this.adicional = new Additional(35);
    }

    @Override
    public Price consultRentalPrice(int days) {
        if(days <= 0){
            throw new InvalidDaysException();
        }
        this.basePrice.multiply(days);
        this.basePrice.add(this.adicional);
        return this.basePrice;
    }
}
