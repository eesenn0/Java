// Import the Random class from the Java util library
import java.util.Random;   
// Import the Scanner class from the Java util library
import java.util.Scanner;  

public class Random {   // Declare a public class named Random

    public static void main(String[] args) {   // Declare the main method
        
        // Create a new instance of the Random class called randomNumber
        Random randomNumber = new Random(); 
        // Create a new instance of the Scanner class called scanner, and pass in System.in as the input source
        Scanner scanner = new Scanner(System.in);   
        
        // Print a message asking the user how many random numbers to generate
        System.out.println("How many random numbers should be printed?");   
        // Read the user's input as a string, convert it to an integer, and assign it to the variable number
        int number = Integer.parseInt(scanner.nextLine());   
        
        for (int i = 0; i < number; i++) {   // Start a for loop that will run number times
            
            // Generate a random integer between 0 and 9 and assign it to the variable numbers
            int numbers = randomNumber.nextInt(10);   
            System.out.println(numbers);   // Print the value of numbers on a new line
        }                    
    }
}
