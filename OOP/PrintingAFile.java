// Import necessary libraries
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

// Define a class named JavaApplication1
public class JavaApplication1 {
    // Define a main method that calls the printFile method
    public static void main(String[] args) {
        printFile();
    }
    
    // Define a method named printFile that prints the content of a file named data.txt
    public static void printFile() {
        try {
            // Create a Scanner object to read data from a file named data.txt
            Scanner scanner = new Scanner(Paths.get("data.txt"));
            // Loop through each line of the file and print it to the console
            while(scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            // Handle any potential exceptions that may occur while trying to read from the file
            System.out.println("Error: " + ex);
        }
    }
}
