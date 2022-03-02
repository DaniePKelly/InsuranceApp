import java.time.LocalDate;

public class HomeTester {

    public static void main(String[] args) {
        System.out.println("Home Testing");

        Home home = getTestHome();

        printHomeInfo(home);

        HomeQuote homeQuote = QuoteManager.getNewQuoteForHome(home,1);

        System.out.printf("\nHome Premium is :$%.2f And is good until " + homeQuote.getEndDate(),homeQuote.getPremium());
    }

    public static Customer getTestCustomer(){
        return new Customer(1,"Daniel","Kelly", LocalDate.of(2000,7,12));
    }

    public static Home getTestHome(){
        return new Home(LocalDate.of(1975,1,1), 400000.0,Home.HeatingType.OIL_HEATING,Home.Area.URBAN);
    }

    public static void printHomeInfo(Home home){
        System.out.printf("Home Details> Heating: %s, Location %s, Age: %d",home.getHeatingType().name(),home.getLocation().name(),home.getAge());
    }
}
