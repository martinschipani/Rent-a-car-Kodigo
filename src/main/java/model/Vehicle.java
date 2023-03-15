package model;

import exceptions.InvalidDaysException;

public abstract class Vehicle implements Rentable {
    protected final String patent;
    protected final Price basePrice;

    public Vehicle(String patent){
        this.patent = patent;
        this.basePrice = new Price(30);
    }

    protected Price setUpConsult(int days){
        if(days <= 0){
            throw new InvalidDaysException();
        }
        Price consultPrice = new Price(0);
        consultPrice.copyValue(this.basePrice);
        return consultPrice;
    }
    public String getPatent(){
        return this.patent;
    }

    public abstract Price consultRentalPrice(int days);

}
