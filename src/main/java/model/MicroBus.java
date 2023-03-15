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
        Price consultPrice = this.setUpConsult(days);
        consultPrice.multiply(days);
        consultPrice.add(this.adicional);
        return consultPrice;
    }
}
