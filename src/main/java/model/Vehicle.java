package model;

public abstract class Vehicle {
    protected final String patent;
    protected final Price basePrice;

    public Vehicle(String patent){
        this.patent = patent;
        this.basePrice = new Price(30);
    }
    public String getPatent(){
        return this.patent;
    }

    public abstract Price consultRentalPrice(int days);

}
