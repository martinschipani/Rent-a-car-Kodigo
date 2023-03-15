package model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentACarTest {

    @Test
    @DisplayName("Base car rental")
    public void test01RentABaseCarFor5DaysItsPriceIs$150(){
        RentACar rentACar = new RentACar();
        Car baseCar = new Car("VEL096");
        rentACar.addVehicle(baseCar);
        assertEquals(150, rentACar.consultRentalPrice("VEL096", 5));
    }


}
