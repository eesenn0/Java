import java.util.Scanner; // to use scanner
import java.util.ArrayList; // to use ArrayList

public class MainProgram { // MainProgram class

    public static void main(String[] args) { // main method
        // Scanner object for inputting data
        Scanner scanner = new Scanner(System.in);
        // An ArrayList to store information about multiple persons
        ArrayList<PersonalInformation> personList = new ArrayList<>();

        // Loop for inputting information about multiple persons
        while (true) {
            // Prompt for name input
            System.out.print("Enter name, empty will end: ");
            // Read the name input
            String name = scanner.nextLine();
            // If the name input is empty, exit the loop
            if (name.isEmpty()) {
                break;
            }

            // Prompt for last name input
            System.out.print("Enter the last name of the person " + name + ": ");
            // Read the last name input
            String last_name = scanner.nextLine();

            // Prompt for ID number input
            System.out.println("Enter the ID number of the person " + name + " "
                    + last_name + ": ");
            // Read the ID number input
            String id_number = scanner.nextLine();

            // Create a PersonalInformation object for the current person
            PersonalInformation new_person = new PersonalInformation(name, last_name, id_number);
            // Add the current person to the person list
            personList.add(new_person);
        }

        // Print the number of inputted persons and the information about them
        System.out.println();
        System.out.println("Total number of persons: " + personList.size());
        System.out.println("Persons: ");

        // Iterate over all the persons in the person list and print their information
        for (PersonalInformation new_person : personList) {
            System.out.println(new_person.name + " " + new_person.last_name + " " + new_person.getIDNumber());
        }
    } // End main method
} // End MainProgram class

// Class to store information about a person
class PersonalInformation {

    // Member variables for storing the name, last name, and ID number of the person
    String name;
    String last_name;
    String id_number;

    // Constructor for initializing the name, last name, and ID number of a person
    public PersonalInformation(String initialName, String initialLastName, String id_number) {
        this.name = initialName;
        this.last_name = initialLastName;
        this.id_number = id_number;
    }

    // Method to get the name of the person
    public String getName() {
        return name;
    }

    // Method to get the last name of the person
    public String getLastName() {
        return last_name;
    }

    // Method to get the ID number of the person
    public String getIDNumber() {
        return id_number;
    }
} // End PersonalInformation class
