// Import the Scanner class from the java.util package
import java.util.Scanner;

public class Main { // Main class

    public static void main(String[] args) { // Main method
        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Create a new Film object
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 5);

        // Ask the user for their age
        System.out.println("How old are you?");
        // Read the user's age as a string and parse it into an integer
        int age = Integer.parseInt(scanner.nextLine());
        
        // A space
        System.out.println();
        // Check if the user's age is greater than or equal to the age rating of the film
        if (age >= chipmunks.ageRating()) {
            // If the user's age is greater than or equal to the age rating, print a message saying they may watch the film
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            // If the user's age is less than the age rating, print a message saying they may not watch the film
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    } // End main method
} // End Main class

class Film { // Film class

    // Declare instance variables
    String name;
    int ageRating;

    // Constructor to create a new Film object with a specified name and age rating
    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    // Method to return the name of a film
    public String name() {
        return this.name;
    }

    // Method to return the age rating of a film
    public int ageRating() {
        return this.ageRating;
    }
} // End Film class
