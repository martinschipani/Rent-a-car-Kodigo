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
        if(days <= 0){
            throw new InvalidDaysException();
        }
        for(Characteristic characteristic: this.characteristics){
            this.basePrice.add(characteristic);
        }
        this.basePrice.multiply(days);
        return this.basePrice;
    }

    public void addCharacteristic(Characteristic characteristic) {
        this.characteristics.add(characteristic);
    }
}
