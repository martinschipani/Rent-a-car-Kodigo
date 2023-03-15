package model;

public class Premium implements Characteristic {
    private final int seating;
    private final int seatingPrice;
    public Premium(int seating){
        this.seating = seating;
        this.seatingPrice = 10;
    }

    public double join(){
        return this.seatingPrice * this.seating;
    }
}
