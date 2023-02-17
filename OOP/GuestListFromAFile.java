import java.io.IOException;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the name of the file to read
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            // Create a scanner to read the file
            Scanner reader = new Scanner(Paths.get(file));
            // Loop through each line of the file and add it to the list
            while (reader.hasNextLine()) {
                String names = reader.nextLine();
                list.add(names);
            }
        } catch (IOException ex) {
            // If an error occurs, print the error message
            System.out.println("Error: " + ex);
        }

        // Prompt the user to enter names, and check if they are in the list
        System.out.println("Enter names, an empty line quits");
        while (true) {
            String names = scanner.nextLine();

            if (names.equals("")) {
                // If the user enters an empty line, break out of the loop
                break;
            }

            if (list.contains(names)) {
                // If the name is in the list, print a message indicating so
                System.out.println("The name is on the list");
            } else {
                // If the name is not in the list, print a message indicating so
                System.out.println("The name is not on the list");
            }
        }
    }
}
