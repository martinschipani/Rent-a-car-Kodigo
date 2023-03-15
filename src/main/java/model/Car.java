package model;

public class Car implements Vehicle{
    private final String patent;
    private final double basePrice;
    public Car(String patent){
        this.patent = patent;
        this.basePrice = 30;
    }

    public String getPatent(){
        return this.patent;
    }

    @Override
    public double consultRentalPrice(int dias) {
        return this.basePrice * dias;
    }
}
