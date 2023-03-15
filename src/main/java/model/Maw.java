package model;
public class Maw implements Characteristic {
    private final int value;
    public Maw(int maw) {
        this.value = maw;
    }

    @Override
    public double join() {
        return this.value;
    }
}
