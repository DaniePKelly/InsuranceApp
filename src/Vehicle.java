import java.time.LocalDate;

/**
 * Vehicle Object for Tylor's Insurance
 */
public class Vehicle {
    private String model;
    private String make;
    private int vehicleYear;
    private Customer customer;
    private int numberOfAccidents;

    /**
     * Constructor for Veichle
     * @param model String
     * @param make String
     * @param vehicleYear int
     * @param customer Customer
     * @param numberOfAccidents int
     */
    public Vehicle(String model, String make, int vehicleYear, Customer customer, int numberOfAccidents) {
        this.model = model;
        this.make = make;
        this.vehicleYear = vehicleYear;
        this.customer = customer;
        this.numberOfAccidents = numberOfAccidents;
    }

    /**
     * Getter for model of car
     * @return String
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter for model of car
     * @param model String
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Getter for make of car
     * @return String
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter for model of car
     * @param make String
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Getter for year of car
     * @return int
     */
    public int getVehicleYear() {
        return vehicleYear;
    }

    /**
     * Setter for year of car
     * @param vehicleYear int
     */
    public void setVehicleYear(int vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    /**
     * Get customer who owns car
     * @return Customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Get number of accidents
     * @return int
     */
    public int getNumberOfAccidents() {
        return numberOfAccidents;
    }

    /**
     * Set number of accidents
     * @param numberOfAccidents int
     */
    public void setNumberOfAccidents(int numberOfAccidents) {
        this.numberOfAccidents = numberOfAccidents;
    }

    /**
     * Function that gets the age of vehicle
     * @return age
     */
    public int AgeOfVehicle(){
        return LocalDate.now().getYear() - vehicleYear;
    }
}