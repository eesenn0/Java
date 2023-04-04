import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntroToLambda {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Create a list to store the user's inputs
        List<String> inputs = new ArrayList<>();
        
        // Loop until the user types "end"
        while (true) {
            // Read a line of input from the user
            String row = scanner.nextLine();                        
            
            // If the user types "end", break out of the loop
            if (row.equals("end")) {
                break;
            }
            
            // Add the user's input to the list
            inputs.add(row);
        }
        
        // Calculate the average of the numbers in the list using Java 8 streams and lambdas
        double average = inputs.stream().mapToInt(s -> Integer.parseInt(s))
                .average().getAsDouble();
        
        // Print the average to the console
        System.out.println("average of the numbers: " + average);
    }
}
