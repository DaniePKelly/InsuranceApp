import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Class that Generates Quotes for Taylor's insurance
 * @author Daniel Kelly
 */
public class QuoteManager {

    //TODO Is this Strict to the Builder Pattern for Quotes? Rename Builder?

    public static HomeQuote getNewQuoteForHome(Home home, int homePolicyID){
        return new HomeQuote(LocalDate.now(),LocalDate.now().plusDays(30),getHomeQuotePremium(home),home,homePolicyID);
    }

    public static AutoQuote getNewAutoQuote(Vehicle vehicle, int autoQuoteID){
        return new AutoQuote(LocalDate.now(),LocalDate.now().plusDays(30),getAutoQuotePremium(vehicle),vehicle,autoQuoteID);
    }

    /**
     * Method to get a Quote Premium for a home.
     * @param home Home
     * @return BigDecimal Premium after tax
     */
    private static BigDecimal getHomeQuotePremium(Home home){
        InsuranceRates insuranceRates = new HardCodeRates();

        BigDecimal homePremium = new BigDecimal(insuranceRates.getBasePremiumHome());
        homePremium = homePremium.multiply(BigDecimal.valueOf(insuranceRates.getHeatingTypeFactor(home.getHeatingType())));
        homePremium = homePremium.multiply(BigDecimal.valueOf(insuranceRates.getLocationFactor(home.getLocation())));
        homePremium = homePremium.multiply(BigDecimal.valueOf(insuranceRates.homeAgeFactor(home.getAge())));
        homePremium = homePremium.multiply(BigDecimal.valueOf(insuranceRates.getHomeValueFactor(home.getValue())));
        homePremium = homePremium.multiply(BigDecimal.valueOf(insuranceRates.tax()));

        return homePremium;
    }

    /**
     * Method to get a Quote Premium for a home.
     * @param vehicle Vehicle
     * @return BigDecimal Premium after tax
     */
    private static BigDecimal getAutoQuotePremium(Vehicle vehicle){
        InsuranceRates insuranceRates = new HardCodeRates();

        BigDecimal autoPremium = new BigDecimal(insuranceRates.getBasePremiumAuto());
        autoPremium = autoPremium.multiply(BigDecimal.valueOf(insuranceRates.getDriverAgeFactor(vehicle.getCustomer().getDriverAge())));
        autoPremium = autoPremium.multiply(BigDecimal.valueOf(insuranceRates.getNumberOfAccidentsFactor(vehicle.getNumberOfAccidents())));
        autoPremium = autoPremium.multiply(BigDecimal.valueOf(insuranceRates.vehicleAgeFactor(vehicle.getVehicleYear())));
        autoPremium = autoPremium.multiply(BigDecimal.valueOf(insuranceRates.tax()));
        return autoPremium;
    }
}
