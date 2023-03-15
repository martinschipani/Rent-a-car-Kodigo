package exceptions;
import model.Car;
import model.RentACar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InvalidDaysErrorTest {
    private RentACar rentACar;
    private Car baseCar;
    @BeforeEach
    public void setUp(){
        this.rentACar = new RentACar();
        this.baseCar = new Car("VEL096");
    }
    @Test
    @DisplayName("You cannot rent vehicles with invalid days")
    public void test01RentVehicleWithDaysEqualTo0ThrowsException(){
        this.rentACar.addVehicle(baseCar);
        assertThrows(InvalidDaysException.class,
                ()->{
                    this.rentACar.consultRentalPrice("VEL096", 0);
                });
    }
    @Test
    public void test02RentVehicleWithDaysEqualToMinusOneThrowsException(){
        this.rentACar.addVehicle(this.baseCar);
        assertThrows(InvalidDaysException.class,
                ()->{
                    this.rentACar.consultRentalPrice("VEL096", -1);
                });
    }

}
