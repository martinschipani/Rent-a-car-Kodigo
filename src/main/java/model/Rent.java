package model;

public class Rent {

    private final Rentable rentable;
    private final int days;

    public Rent(Rentable rentable, int days){
        this.rentable = rentable;
        this.days = days;
    }
    public double calculatePrice() {
        return this.rentable.calculatePrice() * this.days;
    }
}
