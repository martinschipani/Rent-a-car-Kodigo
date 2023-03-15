package model;
import exceptions.InvalidDaysException;
import exceptions.ThePatentWasNotFoundException;
import exceptions.ThereAreNoVehiclesException;
import java.util.HashMap;

public class RentACar {
    private HashMap<String, Vehicle> vehicles;
    private HashMap<String, Client> clients;

    public RentACar(){
        this.vehicles = new HashMap<>();
        this.clients = new HashMap<>();
    }

    private void checkPatent(String patent){
        if(this.vehicles.isEmpty()){
            throw new ThereAreNoVehiclesException();
        }
        if(! this.vehicles.containsKey(patent)){
            throw new ThePatentWasNotFoundException();
        }
    }
    public void addVehicle(Vehicle vehicle) {
        this.vehicles.put(vehicle.getPatent(), vehicle);
    }

    public Price consultRentalPrice(String patent, int days) {
        if(days <= 0){
            throw new InvalidDaysException();
        }
        this.checkPatent(patent);
        Vehicle vehicle = this.vehicles.get(patent);
        return  vehicle.consultRentalPrice(days);
    }

    public void removeVehicle(String patent) {
        this.checkPatent(patent);
        this.vehicles.remove(patent);
    }

    public void addRent(Client client, Rentable rentable, int days) {
        if(days <= 0){
            throw new InvalidDaysException();
        }
        Rent rent = new Rent(rentable, days);
        if(this.clients.containsKey(client.getName())){
            client.addRent(rent);
        }
    }

    //METHODS FOR TEST
    public int getNumberOfVehiclesTest() {
        return this.vehicles.size();
    }


}
