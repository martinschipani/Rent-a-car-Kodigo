package exceptions;
import model.Car;
import model.RentACar;
import model.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThePatentWasNotFoundExceptionTest {
    private RentACar rentACar;
    private Vehicle baseCar;
    @BeforeEach
    public void setUp(){
        this.rentACar = new RentACar();
        this.baseCar = new Car("VEL096");
    }

    @Test
    @DisplayName("Consult rental price, the license plate cannot be found")
    public void test01ConsultRentalPriceWithNonExistentPatentLaunchesException(){
        this.rentACar.addVehicle(baseCar);
        assertThrows(ThePatentWasNotFoundException.class,
                ()->{
                    this.rentACar.consultRentalPrice("MSS083", 2);
                });
    }
}
