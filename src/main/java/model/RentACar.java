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

    private void checkPatent(String patent){
        if(this.vehicles.isEmpty()){
            throw new ThereAreNoVehiclesException();
        }
        if(! this.vehicles.containsKey(patent)){
            throw new ThePatentWasNotFound();
        }
    }
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.put(vehicle.getPatent(), vehicle);
    }

    public double consultRentalPrice(String patent, int days) {
        if(days <= 0){
            throw new InvalidDaysException();
        }
        this.checkPatent(patent);
        Vehicle vehicle = this.vehicles.get(patent);
        return  vehicle.consultRentalPrice(days).getValue();
    }

    public void removeVehicle(String patent) {
        this.checkPatent(patent);
        this.vehicles.remove(patent);
    }

    //METHODS FOR TEST
    public int getNumberOfVehiclesTest() {
        return this.vehicles.size();
    }
}
