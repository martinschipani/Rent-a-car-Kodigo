package model;

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
        this.basePrice.add(this.maw);
        this.basePrice.multiply(days);
        return this.basePrice;
    }
}
