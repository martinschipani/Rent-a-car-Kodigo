package model;

import exceptions.InvalidDaysException;
import exceptions.ThePatentWasNotFound;
import exceptions.ThereAreNoVehiclesException;

import java.util.HashMap;

public class RentACar {
    private HashMap<String, Vehicle> vehicles;

    public RentACar(){
        this.vehicles = new HashMap<>();
    }
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.put(vehicle.getPatent(), vehicle);
    }

    public double consultRentalPrice(String patent, int dias) {
        if(dias <= 0){
            throw new InvalidDaysException();
        }
        if(this.vehicles.isEmpty()){
            throw new ThereAreNoVehiclesException();
        }
        if(! this.vehicles.containsKey(patent)){
            throw new ThePatentWasNotFound();
        }
        Vehicle vehicle = this.vehicles.get(patent);
        return  vehicle.consultRentalPrice(dias);
    }
}
