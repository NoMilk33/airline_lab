import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Flight {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengersOnFlight;
    private boolean isCancelled;

    public Flight (String destination){
        this.destination = destination;
        Random rand = new Random();
        this.flightId = rand.nextInt(10000);
        this.passengersOnFlight = new ArrayList<>();
        this.isCancelled = false;
    }

    public void addPassengerToFlight(Passenger passenger){
        passengersOnFlight.add(passenger); // adds passenger to arraylist from passenger class
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengersOnFlight() {
        return passengersOnFlight;
    }

    public void setPassengersOnFlight(ArrayList<Passenger> passengersOnFlight) {
        this.passengersOnFlight = passengersOnFlight;
    }

    @Override
    public String toString() {
        return "Flight ID: " + flightId + "   " + "Destination: " + destination + "   " + "Cancelled: " + isCancelled;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
