package model;

public class Rent {

    private final Rentable rentable;
    private final int days;

    public Rent(Rentable rentable, int days){
        this.rentable = rentable;
        this.days = days;
    }
    public Price calculatePrice() {
        return this.rentable.consultRentalPrice(this.days);
    }
}
