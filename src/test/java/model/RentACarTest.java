package model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RentACarTest {
    private RentACar rentACar;
    private Vehicle baseCar;
    private Car premiumCar;
    private Vehicle cargoVehicle;
    private Vehicle microBus;
    private Vehicle truck;
    private Client person;
    @BeforeEach
    void setUp(){
        this.rentACar = new RentACar();
        this.baseCar = new Car("VEL096");
        this.premiumCar = new Car("MSS083");
        this.cargoVehicle = new CargoVehicle("ARG023", 800);
        this.microBus = new MicroBus("RUZ092");
        this.truck = new Truck("OPA089");
        this.person = new Person("Martin Schipani");
    }

    @Test
    @DisplayName("Check base car rental price")
    public void test01RentABaseCarFor5DaysItsPriceIs$150(){
        this.rentACar.addVehicle(this.baseCar);
        assertEquals(150, this.rentACar.consultRentalPrice("VEL096", 5).getValue());
    }

    @Test
    @DisplayName("Remove a vehicle and consult it is not found")
    public void test02RemoveAVehicleFromTheListWithSize1TheListIsEmpty(){
        this.rentACar.addVehicle(this.baseCar);
        this.rentACar.removeVehicle(this.baseCar.getPatent());
        assertEquals(0, this.rentACar.getNumberOfVehiclesTest());
    }

    @Test
    @DisplayName("Check premium car rental price")
    public void test03ConsultThePriceOfRentingAPremiumCarWith2SeatsFor7DaysIs350(){
        this.premiumCar.addCharacteristic(new Premium(2));
        this.rentACar.addVehicle(this.premiumCar);
        assertEquals(350, this.rentACar.consultRentalPrice("MSS083", 7).getValue());
    }

    @Test
    @DisplayName("Consult the price of renting a cargo vehicle")
    public void test04ConsultTheRentalPriceOfACargoVehicleWithMoreEqualTo800For2DaysIs8060(){
        this.rentACar.addVehicle(this.cargoVehicle);
        assertEquals(1660, this.rentACar.consultRentalPrice("ARG023", 2).getValue());
    }

    @Test
    @DisplayName("Consult the price of renting a minibus")
    public void test05CheckMinibusRentalPriceFor4DaysIs395(){
        this.rentACar.addVehicle(this.microBus);
        assertEquals(395, this.rentACar.consultRentalPrice("RUZ092", 4).getValue());
    }

    @Test
    @DisplayName("Consult the price of renting a truck")
    public void test06ConsultThePriceOfATruckFor10DaysIs18000(){
        this.rentACar.addVehicle(this.truck);
        assertEquals(18000, this.rentACar.consultRentalPrice("OPA089", 10).getValue());
    }

    /*
    @Test
    @DisplayName("Rent vehicle to client")
    public void test07RentAPremiumCarWith4SeatingToAClientFor7DaysThePrice490(){
        this.premiumCar.addCharacteristic(new Premium(4));
        this.rentACar.addRent(this.person, this.premiumCar, 7);
        assertEquals(490, this.person.calculateTotal().getValue());
    }
     */
}
