// Import necessary libraries
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

// Define a class named JavaApplication1
public class JavaApplication1 {

    // Define a main method that prompts the user for a file name and calls the PrintFile method
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner reader = new Scanner(System.in);

        // Prompt the user for a file name
        System.out.println("Which file should have its contents printed?");
        String file_name = reader.nextLine();
        // Call the PrintFile method with the provided file name
        PrintFile(file_name);
    }

    // Define a method named PrintFile that prints the content of a file with the given name
    public static void PrintFile(String file_name) {
        try {
            // Create a Scanner object to read data from the file
            Scanner scanner = new Scanner(Paths.get(file_name));

            // Loop through each line of the file and print it to the console
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (IOException ex) {
            // Handle any potential exceptions that may occur while trying to read from the file
            System.out.println("Error: " + ex);
        }
    }
}
