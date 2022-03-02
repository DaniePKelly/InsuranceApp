import java.math.BigDecimal;
import java.time.LocalDate;

public class AutoQuote extends Quote{
    private Vehicle vehicle;
    private int autoQuoteID;

    public AutoQuote(LocalDate startDate, LocalDate endDate, BigDecimal premium, Vehicle vehicle,int autoQuoteID) {
        super(startDate, endDate, premium);
        this.vehicle = vehicle;
        this.autoQuoteID = autoQuoteID;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
