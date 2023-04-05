import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProgram06 {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        Scanner scanner = new Scanner(System.in);
        // Create an ArrayList object to store the input messages.
        List<String> list = new ArrayList<>();
        
        // Read input from the console until a blank line is entered.
        while (true) {
            // Read the next line of input.
            String message = scanner.nextLine();
            
            // If the input line is blank, exit the loop.
            if (message.isBlank()) {
                break;
            }
            
            // Add the input message to the ArrayList.
            list.add(message);
        }
        
        // Using the Stream API, print each message in the ArrayList to the console.
        list.stream()
            .forEach(row -> System.out.println(row));
    }
}
