package parkiing_lot.model;


import java.util.HashMap;
import java.util.Map;

public class DailyGarageCheckin {


    Map<Car, Long> carsCheckin = new HashMap<>();

    public void incomingCar(Car car) {
        carsCheckin.put(car, System.currentTimeMillis());
    }

    public Map<Car, Long> getCarsCheckin() {
        return carsCheckin;
    }

    public void setCarsCheckin(Map<Car, Long> carsCheckin) {
        this.carsCheckin = carsCheckin;
    }

}
