import java.util.Random;

public class Passenger {

    String name;
    int contactNumber;
    int passengerID;

    public Passenger(String name, int contactNumber){

        this.name = name;
        this.contactNumber = contactNumber;

        Random rand = new Random();
        this.passengerID = rand.nextInt(10000);
    }

}
