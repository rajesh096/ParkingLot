public class Vehicle {
    protected static int id = 0;
    protected String vehicleNumber;
    protected String ownerName;
    protected String contachNo;
    Vehicle(String vehicleNumber, String ownerName, String contachNo){
        this.contachNo = contachNo;
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        id++;
    }


}
