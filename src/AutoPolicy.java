import java.time.LocalDate;

public class AutoPolicy extends Policy {
    private Vehicle vehicle;
    private int autoPolicyNumber;

    /**
     * Auto policy constructor
     * @param policyholder Customer
     * @param startDate LocalDate
     * @param endDate LocalDate
     * @param vehicle Vehicle
     * @param autoPolicyNumber int
     */
    public AutoPolicy(Customer policyholder, LocalDate startDate, LocalDate endDate, Vehicle vehicle,int autoPolicyNumber) {
        super(policyholder, startDate, endDate);
        this.vehicle = vehicle;
        this.autoPolicyNumber = autoPolicyNumber;
    }

    /**
     * Getter for vehicle
     * @return Vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    @Override
    public double premium() {
        return 0;
    }
}
