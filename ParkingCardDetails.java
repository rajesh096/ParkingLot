public class ParkingCardDetails {
    private static int pcId;
    private int remainingAmt;
    private boolean isActive;
    ParkingCardDetails(int remainingAmt, boolean isActive){
        this.isActive = isActive;
        this.remainingAmt = remainingAmt;
        pcId++;
    }

}
