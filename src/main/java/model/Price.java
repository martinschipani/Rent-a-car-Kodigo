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

    public void multiply(int value) {
        this.value *= value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void copyValue(Price price) {
        this.value = price.getValue();
    }

    public void addValue(double value) {
        this.value += value;
    }
}
