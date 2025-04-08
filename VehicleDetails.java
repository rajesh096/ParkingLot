import javax.swing.plaf.multi.MultiSeparatorUI;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDate.*;
import java.time.LocalTime;
import java.util.Date;

public class VehicleDetails {
    private Vehicle vehicle;
    private static int vdId = 0;
    private LocalDate date;
    private LocalTime entryTime;
    private LocalTime expectedTime;
    private LocalTime exitTime;
    private Fine fine;
    private Payment payment;
    private boolean usingCard;
    private String vehicletype;
    VehicleDetails(Vehicle vehicle, Fine fine, Payment payment, boolean usingCard, String vehicletype){
        this.vehicle = vehicle;
        this.fine = fine;
        this.payment = payment;
        this.usingCard  = usingCard;
        this.vehicletype  = vehicletype;
        this.date = LocalDate.now();
        this.entryTime = LocalTime.now();
        this.expectedTime = this.entryTime.plusHours(2);
        this.exitTime = null;
        vdId++;
    }

}
