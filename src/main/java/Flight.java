import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengersOnFlight;
    private int capacity;
    private boolean isCancelled;

    public Flight (String destination){
        this.destination = destination;
        this.flightId = flightId; //randomised?
        this.passengersOnFlight = new ArrayList<>();
        this.capacity = 100;
        this.isCancelled = false;

    }
    public void bookPassenger(Passenger passenger){
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
