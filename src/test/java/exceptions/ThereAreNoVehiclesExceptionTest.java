package exceptions;

import model.RentACar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ThereAreNoVehiclesExceptionTest {
    private RentACar rentACar;
    @BeforeEach
    public void setUp(){
        this.rentACar = new RentACar();
    }

    @Test
    @DisplayName("Consult vehicles without vehicles")
    public void test01ConsultRentalPriceFor1DayInEmptyListLaunchesException(){
        assertThrows(ThereAreNoVehiclesException.class,
                ()->{
                    this.rentACar.consultRentalPrice("VEL096", 1);
                });
    }
}
