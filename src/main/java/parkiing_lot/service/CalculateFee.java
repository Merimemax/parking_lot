package parkiing_lot.service;

public class CalculateFee {

    public static final double PARKIING_FEE = 5.00;

    public double calculateFee(String license_plate, long checkingTime){

        if(haveMonthlyPass(license_plate)){
            return 0;
        }
        long checkOut = System.currentTimeMillis();

        long totalTime = checkingTime - checkOut;

        int hours   = (int) ((totalTime / (1000*60*60)) % 24);

        double fee = PARKIING_FEE * hours;

        if(fee > 30){
            return 30;
        }else {
            return fee;
        }

    }

    private boolean haveMonthlyPass(String license_plate) {
        return false;
    }
}
