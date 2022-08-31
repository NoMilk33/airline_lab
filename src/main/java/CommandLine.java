import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {

    private ArrayList<Flight> flightList;

    private ArrayList<Passenger> passengerList;

    public CommandLine() {
        this.flightList = new ArrayList<>();
        this.passengerList = new ArrayList<>();
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
        System.out.println(passengerList); // maybe add overwrite toString method for passenger object?

    }

    public void addPassengerToList(Passenger passenger){
        passengerList.add(passenger);
    }

    public String showFlights(){
        return "empty";
    }


}
