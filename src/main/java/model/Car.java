package model;
import exceptions.InvalidDaysException;

import java.util.ArrayList;
import java.util.Collection;

public class Car extends Vehicle {

    private Collection<Characteristic> characteristics;
    public Car(String patent){
        super(patent);
        this.characteristics = new ArrayList<>();
    }

    @Override
    public Price consultRentalPrice(int days) {
        Price consultPrice = this.setUpConsult(days);
        for(Characteristic characteristic: this.characteristics){
            consultPrice.add(characteristic);
        }
        consultPrice.multiply(days);
        return consultPrice;
    }

    public void addCharacteristic(Characteristic characteristic) {
        this.characteristics.add(characteristic);
    }
}
