import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>(); // create an ArrayList to store last names
        
        while (true) {
            // prompt the user to input first name, last name, and birth year
            System.out.print("Input first name: ");
            String firstName = scanner.nextLine();   
            
            System.out.print("Input last name: ");
            String lastName = scanner.nextLine();
            
            list.add(lastName); // add the last name to the ArrayList
            
            System.out.print("Input the year of birth: ");
            String birthYear = scanner.nextLine();
            
            System.out.println();
            
            // prompt the user to continue or quit entering personal information
            System.out.println("Continue personal information input? 'quit' ends:");
            String quit = scanner.nextLine();
            
            if (quit.equals("quit")) { // if the user inputs "quit", break out of the loop
                break;
            } else { // otherwise, continue the loop
                continue;
            }   
        }
        
        // print the distinct last names in alphabetical order
        list.stream()
                .distinct() // remove duplicate last names
                .sorted() // sort the list in alphabetical order
                .forEach(lastName -> System.out.println(lastName)); // print each last name to the console
    }
}
