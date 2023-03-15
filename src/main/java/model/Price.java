package model;

public class Price {
    private double value;

    public Price(double value){
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }

    public void add(Characteristic characteristic) {
        this.value += characteristic.join();
    }

    public void multiply(int days) {
        this.value *= days;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
