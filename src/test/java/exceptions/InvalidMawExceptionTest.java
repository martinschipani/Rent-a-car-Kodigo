package exceptions;

import model.CargoVehicle;
import model.RentACar;
import model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InvalidMawExceptionTest {
    private RentACar rentACar;
    private Vehicle cargoVehicle;
    @BeforeEach
    public void setUp(){
        this.rentACar = new RentACar();
    }
    @Test
    @DisplayName("Create cargo vehicle with invalid maw")
    public void test01CreateCargoVehicleWithPlusEqualTo0ThrowsException(){
        assertThrows(InvalidMawException.class,
                ()->{
                    this.cargoVehicle = new CargoVehicle("IPA006", 0);
                });
    }

    @Test
    public void test02CreateCargoVehicleWithPlusEqualToMinimumOneThrowsException(){
        assertThrows(InvalidMawException.class,
                ()->{
                    this.cargoVehicle = new CargoVehicle("IPA006", -1);
                });
    }
}
