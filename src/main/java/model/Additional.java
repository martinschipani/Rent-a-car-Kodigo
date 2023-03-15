package model;

public class Additional implements Characteristic {
    private final double value;
    public Additional(double value) {
        this.value = value;
    }

    public double join(){
        return this.value;
    }
}
