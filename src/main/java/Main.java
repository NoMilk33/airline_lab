import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CommandLine commandLine = new CommandLine();


     while(commandLine.isRunning()){
         commandLine.showMenu();
         System.out.println("Enter your choice: ");
         Scanner console = new Scanner(System.in);
         try {
             int menuChoice= console.nextInt();
             if (menuChoice == 0){
                 commandLine.showMenu();
             } else if (menuChoice == 1){
                 commandLine.addFlight(); //user input, adds new flight to arraylist
             } else if (menuChoice == 2){
                 commandLine.displayFlight(); //print out flight arraylist
             } else if (menuChoice == 3){
                 commandLine.addPassenger(); //user input, adds new passenger to arraylist
             } else if (menuChoice == 4){
                 commandLine.bookPassenger();//prints flight arraylist, asks for user selection. print passenger arraylist,asks for selection. adds passenger to passenger on flights arraylist.
             } else if (menuChoice == 5){
                 commandLine.cancelFlight();//prints flight arraylist, asks for selection and removes from aarraylist
             } else if (menuChoice == 6){
                 System.out.println("Command Line shutdown.");
                 break;} else
                 System.out.println("Invalid choice!");
         } catch (InputMismatchException exception){
             System.out.println("please input a number");
         }
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








