package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RentACarTest {
    private RentACar rentACar;
    private Car baseCar;
    private Car premiumCar;
    @BeforeEach
    void setUp(){
        this.rentACar = new RentACar();
        this.baseCar = new Car("VEL096");
        this.premiumCar = new Car("MSS083");
    }

    @Test
    @DisplayName("Check base car rental price")
    public void test01RentABaseCarFor5DaysItsPriceIs$150(){
        this.rentACar.addVehicle(this.baseCar);
        assertEquals(150, this.rentACar.consultRentalPrice("VEL096", 5));
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
        assertEquals(350, this.rentACar.consultRentalPrice("MSS083", 7));
    }
}
