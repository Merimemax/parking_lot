package parkiing_lot.service;

import org.junit.Before;
import org.junit.Test;
import parkiing_lot.model.Car;
import parkiing_lot.model.DailyGarageCheckin;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculateFeeTest {


    public static final double MOCK_FEE = 25.00;

    Car car;
    DailyGarageCheckin checkin;
    CalculateFee calculateFee;

    @Before
    public void setup(){
        car = new Car();
        checkin = new DailyGarageCheckin();
        calculateFee = new CalculateFee();

        car.setLicense_plate("123");
        checkin.incomingCar(car);
    }

    @Test
    public void calculateFee() {

       CalculateFee calculateFee = mock(CalculateFee.class);
       when(calculateFee.calculateFee(car.getLicense_plate(), checkin.getCarsCheckin().get(car))).thenReturn(MOCK_FEE);

       calculateFee.calculateFee(car.getLicense_plate(), checkin.getCarsCheckin().get(car));

        verify(calculateFee, times(1)).calculateFee(car.getLicense_plate(), checkin.getCarsCheckin().get(car));

    }
}
