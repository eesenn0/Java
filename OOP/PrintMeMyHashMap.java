import java.util.HashMap;

public class JavaApplication42 {

    public static void main(String[] args) {
        // Create a new HashMap instance with keys and values of type String
        HashMap<String, String> hashmap = new HashMap<>();
        
        // Add some entries to the hashmap
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and son on");
        hashmap.put("i.e", "more precisely");
        
        // Print all the keys in the hashmap
        Program.printKeys(hashmap);
        System.out.println("---");
        
        // Print the keys in the hashmap that contain a specific text
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        
        // Print the values associated with keys in the hashmap that contain a specific text
        Program.printValuesOfKeysWhere(hashmap, ".e");
    }
    
}

class Program {
    // A method to print all the keys in a hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String keys : hashmap.keySet()) {
            System.out.println(keys);
        }        
    }
    
    // A method to print the keys in a hashmap that contain a specific text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String keys : hashmap.keySet()) {
            if (!keys.contains(text)) {
            // If the key does not contain the specified text, skip to the next iteration
            continue;
            }
            // print keys
            System.out.println(keys);
        }
    }
    
    // A method to takes a hashmap and a string as arguments and prints the values of keys containing the string
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String keys : hashmap.keySet()) {
            if (keys.contains(text)) {
                System.out.println(hashmap.get(keys));
            }
        }
    }
}
