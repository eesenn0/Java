import java.io.IOException; // Importing the IOException class
import java.nio.file.Paths; // Importing the Paths class from the nio.file package
import java.util.Scanner;   // Importing the Scanner class

public class MainProgram { // Declaring a class called 'MainProgram'

    public static void main(String[] args) {
        // Creating a new scanner object that reads input from the console
        Scanner scanner = new Scanner(System.in);    

        System.out.println("Name of the file:");  // Prompting the user to enter a file name
        String file = scanner.nextLine(); // Reading the file name from the console

        try {
            // Creating a new scanner object that reads from the specified file
            Scanner reader = new Scanner(Paths.get(file)); 

            while (reader.hasNextLine()) { // Loop through the file until there are no more lines to read
                String line = reader.nextLine(); // Read the next line from the file

                String parts[] = line.split(","); // Split the line into parts using comma as the delimiter
                
                // Extract the name from the first part of the line
                String name = parts[0]; 
                // Extract the age from the second part of the line and convert it to an integer
                int age = Integer.parseInt(parts[1]);  

                // Print the name and age of the person
                System.out.println(name + ", age: " + age + " years");  
            }
        } catch (IOException ex) { // Catch any IOException that might occur while trying to read the file
            System.out.println("Error: " + ex); // Print the error message
        }
    }
}
