package parkiing_lot.service;

public class CalculateFee {

    private static final double PARKING_FEE = 5.00;
    private static final double MAX_FEE = 30.00;

    public double calculateFee(String license_plate, long checkingTime){

        if(haveMonthlyPass(license_plate)){
            return 0;
        }
        long checkOut = System.currentTimeMillis();

        long totalTime = checkingTime - checkOut;

        int hours   = (int) ((totalTime / (1000*60*60)) % 24);

        double fee = PARKING_FEE * hours;

        return fee > MAX_FEE ? MAX_FEE : fee;

    }

    private boolean haveMonthlyPass(String license_plate) {

        //we check our system if this license plate is registered
        //for monthly parking subscription

        return false;
    }
}
