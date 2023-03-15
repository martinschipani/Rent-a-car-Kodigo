package model;
import java.util.ArrayList;
import java.util.Collection;

public class Person implements Client {
    private final String name;
    private Collection<Rent> rents;

    public Person(String name) {
        this.name = name;
        this.rents = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addRent(Rent rent){
        this.rents.add(rent);
    }

    public double calculateTotal(){
        double total = 0;
        for(Rent rent: this.rents){
            total += rent.calculatePrice();
        }
        return total;
    }
}
