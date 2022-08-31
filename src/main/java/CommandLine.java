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

    public void addFlight(){
        System.out.println("Please enter the Destination:");
        Scanner inputScanner = new Scanner(System.in);
        String destination = inputScanner.nextLine();
        Flight newFlight = new Flight(destination);
        addFlight(newFlight);
        System.out.println("Success! Confirmed list of flights at current: " + flightList);
    }

    public void displayFlight() {
        System.out.println("Confirmed flights:");
        for (Flight flight : flightList) {
            System.out.println(flight);
        }
    }
    public void addPassenger() {
        System.out.println("Passenger name:");
        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();
        System.out.println("Contact number:");
        Scanner numberScanner = new Scanner(System.in);
        String contactNumber = numberScanner.nextLine();
        Passenger newPassenger = new Passenger(name,contactNumber);
        passengerList.add();
        addPassengerToList(newPassenger);
        System.out.println("Success! Confirmed list of passengers at current: " + passengerList);
    }

    public void bookPassenger(){
        displayFlight();
        System.out.println("Select flight ID to add passenger: ");
        Scanner idScanner = new Scanner(System.in);
        int bookedId = idScanner.nextInt();
        System.out.println("Select passenger ID to add to flight: ");
        Scanner nameScanner = new Scanner(System.in);
        int passengerId = nameScanner.nextInt();


        Passenger bookedPassenger = null;
        for (Passenger passenger: passengerList){
            if (passenger.getPassengerID() == passengerId){
               bookedPassenger = passenger;
            }
        }

        for (Flight flight: flightList){
            if (flight.getFlightId()== bookedId){
                flight.addPassengerToFlight(bookedPassenger);
                System.out.println("Passenger booking success!");
                System.out.println("Passengers on flight to " + flight.getDestination() + " : " + flight.getPassengersOnFlight());
                System.out.println("number of passengers: " + flight.getPassengersOnFlight().size());


            }
        }


        //sout passengersOnFlight flightID
    }



    public void cancelFlight(){
        displayFlight();
        System.out.println("Select flight ID to cancel: ");
        Scanner idScanner = new Scanner(System.in);
        int cancelledId = idScanner.nextInt();
        for (Flight flight: flightList){
            if (flight.getFlightId() == cancelledId){
                flight.setCancelled(true);
            }
        }

    }

    public void addPassengerToList(Passenger passenger){
        passengerList.add(passenger);
    }

    public void addFlight(Flight flight){
        flightList.add(flight);
    }


    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
