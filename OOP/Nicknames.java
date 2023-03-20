// Import the HashMap class from the java.util package
import java.util.HashMap;

// Define a public class named Main
public class Main {

    // Define the main method that takes an array of Strings as input
    public static void main(String[] args) {
        
        // Create a new instance of the HashMap class with String keys and values
        HashMap<String, String> nickNames = new HashMap<>();
        
        // Add some key-value pairs to the HashMap
        nickNames.put("Matthew", "Matt");
        nickNames.put("Michael", "Mix");
        nickNames.put("Arthur", "Artie");
        
        // Print the value associated with the key "Matthew" to the console
        System.out.println(nickNames.get("Matthew"));
    }
    
}
