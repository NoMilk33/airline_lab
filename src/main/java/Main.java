import java.io.Console;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();


     while(commandLine.isRunning()){
         System.out.println("***********Menu***********");
         System.out.println("1. Add new flight");
         System.out.println("2. Display all flights");
         System.out.println("3. Add new passenger");
         System.out.println("4. Book passenger onto flight");
         System.out.println("5. Cancel a flight");
         System.out.println("6. Quit");
         Console console = System.console();
         int menuChoice=Integer.parseInt(console.readLine("Enter your choice: "));
         if (menuChoice == 1){
             commandLine.addFlight(); //user input, adds new flight to arraylist
         } else if (menuChoice == 2){
             commandLine.displayFlights(); //print out flight arraylist
         } else if (menuChoice == 3){
             commandLine.addPassenger(); //user input, adds new passenger to arraylist
         } else if (menuChoice == 4){
            commandLine.bookPassenger();//prints flight arraylist, asks for user selection. print passenger arraylist,asks for selection. adds passenger to passenger on flights arraylist.
         } else if (menuChoice == 5){
            commandLine.cancelFlight();//prints flight arraylist, asks for selection and removes from aarraylist
         } else if (menuChoice == 6){
            break;} else
            System.out.println("Invalid choice!");

         }
     }
    }



//    while CommandLine = true {
//    prints menu showing all commands
//    System.out.println("***********Menu***********");
//    System.out.println("1. Add new flight");
//    System.out.println("2. Display all flights");
//    System.out.println("3. Add new passenger");
//    System.out.println("3. Book passenger onto flight");
//    System.out.println("3. Cancel a flight");
//if they type help, the menu shows up at any point
// user input (scanner) activates corresponding method
//    if user selects quit - commandLine = false
// }


//
//    if(mChoice==1)
//    {
//    sw101.AddPassenger();
//    }
//    else if(mChoice==2)
//    {
//    sw101.RemovePassenger();
//    }
//    else if(mChoice==3)
//    {
//    //Quit
//    break;
//    }
//    else
//    {
//    System.out.println("Invalid choice!");





