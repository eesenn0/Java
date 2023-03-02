public class MainProgram {

    public static void main(String[] args) {
        // Create a new SimpleCollection with the name "alphabet"
        SimpleCollection s = new SimpleCollection("alphabet");
        
        // Print out the collection
        System.out.println(s);
        
        // Add the element "a" to the collection
        s.add("a");
        
        // Print out the collection
        System.out.println(s);
        
        // Add the element "b" to the collection
        s.add("b");
        
        // Print out the collection
        System.out.println(s);
        
        // Add the element "c" to the collection
        s.add("c");
        
        // Print out the collection
        System.out.println(s);                
    }
    
}

import java.util.ArrayList;

class SimpleCollection {
    // Declare a private ArrayList to hold the elements of the collection
    private ArrayList<String> list;
    
    // Declare a private String to hold the name of the collection
    private String collection;
    
    // Constructor that takes the name of the collection as a parameter
    public SimpleCollection(String collection) {
        // Initialize the name of the collection
        this.collection = collection;
        
        // Initialize the ArrayList to hold the elements of the collection
        this.list = new ArrayList<>();
    }
    
    // Method to add an element to the collection
    public void add(String element) {
        // Add the element to the ArrayList
        list.add(element);
    }
    
    // Override the toString method to print out the collection
    @Override
    public String toString() {
        // Check if the collection is empty
        if(list.isEmpty()) {
            // Return a message indicating that the collection is empty
            return "The collection " + this.collection + " is empty.";
        }
               
        // Initialize a string to hold the output message
        String printOutput = "The collection " + this.collection + " has " + list.size()
                 + " elements:\n";
        
        // Loop through the elements of the collection
        for(String element : list) {
            // Add the element to the output message with a newline character
            printOutput += element + "\n";
        }
        
        // Return the output message
        return printOutput;
    }
}
