package model;

public interface Vehicle {
    String getPatent();

    Price consultRentalPrice(int days);
    void addCharacteristic(Characteristic characteristic);
}
