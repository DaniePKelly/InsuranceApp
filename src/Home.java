import java.time.LocalDate;

/**
 * @author Daniel Kelly
 * Customer Object for Taylor's Insurance
 */
public class Home {
    private LocalDate yearBuilt;
    private Double value;
    private HeatingType heatingType;
    private Area location;

    public enum HeatingType{
        OIL_HEATING,
        WOOD_HEATING,
        OTHER_HEATING
    }

    public enum Area{
        URBAN,
        RURAL
    }

    /**
     * Home object for Taylor's Insurance
     * @param yearBuilt LocalDate
     * @param value Double
     * @param heatingType heatingType
     * @param location area
     */
    public Home(LocalDate yearBuilt, Double value, HeatingType heatingType, Area location) {
        this.yearBuilt = yearBuilt;
        this.value = value;
        this.heatingType = heatingType;
        this.location = location;
    }

    /**
     * Getter for the year home was built
     * @return LocalDate
     */
    public LocalDate getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Getter for value of home
     * @return double
     */
    public Double getValue() {
        return value;
    }

    /**
     * Setter for value of home
     * @param value double
     */
    public void setValue(Double value) {
        this.value = value;
    }

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public Area getLocation() {
        return location;
    }

    public int getAge(){
        return LocalDate.now().getYear() - yearBuilt.getYear();
    }
}
