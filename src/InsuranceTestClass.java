import java.time.LocalDate;
import java.util.Random;

public class InsuranceTestClass {
    static Random random = new Random();
    public static void main(String[] args) {

        Vehicle vehicle = getTestVehicle();
        Customer customer = getTestCustomer();
        Home home = getTestHome();

        System.out.println("Home Testing");

        printHomeInfo(home);

        HomeQuote homeQuote = QuoteManager.getNewQuoteForHome(home,1);

        System.out.printf("\n\n\tHome Quote Info\n==================\nHome Premium is :$%.2f And is good until " + homeQuote.getEndDate(),homeQuote.getPremium());

        System.out.printf("\n\n\tVehicle Info\n==================\n Owner %s\n Make: %s\n Model: %s\n Year: %d\n Number Of Accidents: %d\n",vehicle.getCustomer().getFirstName() + " " +vehicle.getCustomer().getLastName(),vehicle.getMake(),vehicle.getModel(),vehicle.getVehicleYear(),vehicle.getNumberOfAccidents());

        AutoQuote autoQuote =  QuoteManager.getNewAutoQuote(vehicle,1);

        System.out.printf("\n\tAuto Quote Info\n==================\n Premium is :%.2f and its valid until " + autoQuote.getEndDate(),autoQuote.getPremium());

    }
    public static Customer getTestCustomer(){
        return new Customer(random.nextInt(1,100),"Daniel","Kelly", LocalDate.of(random.nextInt(1950,2000),7,12));
    }

    public static Vehicle getTestVehicle(){
        return new Vehicle("Civic","Honda",random.nextInt(1980,2022),getTestCustomer(), random.nextInt(0,10));
    }

    public static Home getTestHome(){
        return new Home(LocalDate.of(random.nextInt(1900,2022),1,1), random.nextDouble(100000.0,1000000),Home.HeatingType.OIL_HEATING,Home.Area.URBAN);
    }

    public static void printHomeInfo(Home home){
        System.out.printf("\n\n\tHome Details\n==================\n Heating: %s\n Location: %s\n Age: %d\n Value: %.2f",home.getHeatingType().name(),home.getLocation().name(),home.getAge(),home.getValue());
    }

}
