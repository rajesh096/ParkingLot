public class Payment {
    private static int payId;
    private String source;
    private int amount;
    Payment(String source, int amount){
        this.source = source;
        this.amount = amount;
        payId++;
    }
}
