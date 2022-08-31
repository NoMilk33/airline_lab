import java.util.Random;

public class Passenger {

    String name;
    String contactNumber;
    int passengerID;

    public Passenger(String name, String contactNumber){

        this.name = name;
        this.contactNumber = contactNumber;

        Random rand = new Random();
        this.passengerID = rand.nextInt(10000);
    }
    
    

    @Override
    public String toString() {
        return "Passenger{ name=" + name + '\'' +
                ", passengerID=" + passengerID +
                '}';
    }


    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }
}
