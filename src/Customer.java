import java.time.LocalDate;

/**
 * @author Daniel Kelly
 * Customer Object for Taylor's Insurance
 */
public class Customer {
    private int customerID;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    /**
     * Constructor for a customer in Taylor's Insurance App
     * @param firstName String
     * @param lastName String
     * @param dateOfBirth LocalDate
     */
    public Customer(int customerID, String firstName, String lastName, LocalDate dateOfBirth) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Getter for First Name of Customer
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter for Customer Last Name
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for Customer Last Name
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter for Customer Last Name
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for Customer Date of Birth
     * @return LocalDate
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Setter for Customer Date of Birth
     * @param dateOfBirth LocalDate
     */
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDriverAge(){
        return LocalDate.now().getYear() - dateOfBirth.getYear() ;
    }
}
