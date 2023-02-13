import java.util.Scanner; // To use scanner
import java.util.ArrayList; // To use ArrayList

public class MainProgram { // MainProgram class

    public static void main(String[] args) { // Main method

        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the television programs
        ArrayList<TelevisionPrograms> nameList = new ArrayList<>();

        // Loop to continuously get the name and duration of television programs until the user enters a blank name
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();

            // If the name entered is blank, break out of the loop
            if (name.isBlank()) {
                break;
            }

            System.out.println("Duration?");
            int duration = Integer.parseInt(scanner.nextLine());

            // Create a new TelevisionPrograms object
            TelevisionPrograms new_series = new TelevisionPrograms(name, duration);

            // Add the new TelevisionPrograms object to the ArrayList
            nameList.add(new_series);
        }

        // Get the maximum duration from the user
        System.out.println("Program's maximum duration? ");
        int max_duration = Integer.parseInt(scanner.nextLine());

        // Loop through the ArrayList and print the name and duration of television programs with a duration less than or equal to the maximum duration
        int i = 0;
        while (nameList.get(i).getDuration() <= max_duration) {

            System.out.println(nameList.get(i).name + ", " + nameList.get(i).duration);
            i++;
        }
    } // End main method
} // End MainProgram class

class TelevisionPrograms { // TelevisionPrograms class

    // Variables to store the name and duration of the television program
    String name;
    int duration;

    // Constructor to initialize the name and duration of the television program
    public TelevisionPrograms(String initialName, int initialDuration) {
        this.name = initialName;
        this.duration = initialDuration;
    }

    // Method to get the name of the television program
    public String getName() {
        return name;
    }

    // Method to get the duration of the television program
    public int getDuration() {
        return duration;
    }
} // End TelevisionPrograms class
