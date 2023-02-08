import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use arraylist

public class OnTheList { // OnTheList class

    public static void main(String[] args) { // main method
        // create a scanner to get input from user
        Scanner scanner = new Scanner(System.in);
        // create a list to store the input values
        ArrayList<String> list = new ArrayList<>();

        while (true) { // while condition
            String names = scanner.nextLine(); // inputs

            if (names.equals("")) { // break condition
                break;
            }
            // adding names to list
            list.add(names);
        }   // end of while condition

        // asking the name
        System.out.println("Search for?");
        String person = scanner.nextLine();

        while (true) { // while loop
            if (list.contains(person)) {
                System.out.println(person + " was found!");
                break;
            } else {
                System.out.println(person + " was not found!");
                break;
            }
        }
    } // end main method
} // end OnTheList class
