import java.time.LocalDate;

public class AutoTester {

    public static void main(String[] args) {
        Vehicle vehicle =getTestVehicle();

        System.out.printf("\tVehicle Info\n==================\n Owner %s\n Make: %s\n Model: %s\n Year: %d\n Number Of Accidents: %d\n",vehicle.getCustomer().getFirstName() + " " +vehicle.getCustomer().getLastName(),vehicle.getMake(),vehicle.getModel(),vehicle.getVehicleYear(),vehicle.getNumberOfAccidents());

        AutoQuote autoQuote =  QuoteManager.getNewAutoQuote(vehicle,1);

        System.out.printf("\n\tQuote Info\n==================\n Premium is :%.2f and its valid until " + autoQuote.getEndDate(),autoQuote.getPremium());
    }

    public static Customer getTestCustomer(){
        return new Customer(1,"Daniel","Kelly", LocalDate.of(2000,7,12));
    }

    public static Vehicle getTestVehicle(){
        return new Vehicle("Civic","Honda",2021,getTestCustomer(),3);
    }
}
