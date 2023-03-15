package model;

import exceptions.InvalidDaysException;
import exceptions.InvalidMawException;

public class CargoVehicle extends Vehicle {
    private final Characteristic maw;

    public CargoVehicle(String patent, int maw) {
        super(patent);
        if(maw <= 0){
            throw new InvalidMawException();
        }
        this.maw = new Maw(maw);
    }

    public Price consultRentalPrice(int days){
        Price consultPrice = this.setUpConsult(days);
        consultPrice.add(this.maw);
        consultPrice.multiply(days);
        return consultPrice;
    }
}
