package model;
import java.util.ArrayList;
import java.util.Collection;

public class Car implements Vehicle{
    private final String patent;
    private Price basePrice;

    private Collection<Characteristic> characteristics;
    public Car(String patent){
        this.patent = patent;
        this.characteristics = new ArrayList<>();
        this.basePrice = new Price(30);
    }

    public String getPatent(){
        return this.patent;
    }

    @Override
    public Price consultRentalPrice(int days) {
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
