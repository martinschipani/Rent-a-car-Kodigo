package model;

public interface Client {
    String getName();

    void addRent(Rent rent);

    Price calculateTotal();
}
