import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {

    private ArrayList<Flight> flightList;

    private ArrayList<Passenger> passengerList;
    
    private boolean isRunning;

    public CommandLine() {
        this.flightList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
        this.isRunning = true;   
    }             

    public void addPassenger() {
        System.out.println("Passenger name:");
        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();
        System.out.println("Contact number:");
        Scanner numberScanner = new Scanner(System.in);
        String contactNumber = numberScanner.nextLine();
        Passenger newPassenger = new Passenger(name,contactNumber);
        addPassengerToList(newPassenger);
        System.out.println(passengerList); // maybe add overwrite toString method for passenger object?

    }

    public void addFlight(){
        System.out.println("Please enter the Destination:");
        Scanner inputScanner = new Scanner(System.in);
        String destination = inputScanner.nextLine();

        Flight newFlight = new Flight(destination);
        addFlight(newFlight);
        System.out.println(flightList);
    }
    
    
    public void cancelFlight(){
        return;
    }
    
    public void bookPassenger(){
        return;
    }
    public void addPassengerToList(Passenger passenger){
        passengerList.add(passenger);
    }

    public void addFlight(Flight flight){
        flightList.add(flight);
    }

    public String displayFlights(){
        return "empty";
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
